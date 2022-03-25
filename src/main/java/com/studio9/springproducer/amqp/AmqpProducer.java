package com.studio9.springproducer.amqp;

public interface AmqpProducer<T> {
    void producer(T t);
}
