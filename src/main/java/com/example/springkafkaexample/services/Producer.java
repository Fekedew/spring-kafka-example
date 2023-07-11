package com.example.springkafkaexample.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {

    @Autowired
    KafkaTemplate<String, String > template;

    public void sendMessage(String message){
        template.send("testTopic", message);
    }

}
