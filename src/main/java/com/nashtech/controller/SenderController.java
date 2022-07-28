package com.nashtech.controller;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/sender")
public class SenderController {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Value("${rabbit.topic-exchange-name}")
    private static String TOPIC_EXCHANGE_NAME;

    @Value("${rabbit.routing-key}")
    private static String ROUTING_KEY;

    @GetMapping("/{message}")
    public void sendMessage(@PathVariable String message) {
        rabbitTemplate.convertAndSend(TOPIC_EXCHANGE_NAME, ROUTING_KEY, message);
    }
}
