package com.example.springkafkaexample.controllers;

import com.example.springkafkaexample.services.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
@RequestMapping("/api/kafka")
public class KafkaController {

    @Autowired
    Producer producer;

    @GetMapping(value = "/producer")
    public String sendMessage(@RequestParam("message") String message)
    {
        producer.sendMessage(message);
        return "Message sent Successfully to the topic - watch your terminal";
    }
}
