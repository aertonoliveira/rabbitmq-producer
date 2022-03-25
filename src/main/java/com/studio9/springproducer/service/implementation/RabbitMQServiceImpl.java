package com.studio9.springproducer.service.implementation;

import com.studio9.springproducer.amqp.AmqpProducer;
import com.studio9.springproducer.dto.MessageQueue;
import com.studio9.springproducer.service.AmqpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQServiceImpl implements AmqpService {

    @Autowired
    private AmqpProducer<MessageQueue> amqp;

    @Override
    public void sendToConsumer(MessageQueue message) {
        amqp.producer(message);
    }
}
