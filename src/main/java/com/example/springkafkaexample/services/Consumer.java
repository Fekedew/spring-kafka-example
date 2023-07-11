package com.example.springkafkaexample.services;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    @KafkaListener(topics = "testTopic", groupId = "test_group")
    public void listenToTopic(String message){
        System.out.println("Message received message" + message);
    }
}
