package com.studio9.springproducer.service;

import com.studio9.springproducer.dto.MessageQueue;

public interface AmqpService {
    void sendToConsumer(MessageQueue message);
}
