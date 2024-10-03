package com.sanjay.spring_kafka.producer;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
@Slf4j
public class KafkaProducer {

    private final KafkaTemplate<String, String> template;
    public void sendMessage(String message) {
        log.info(String.format("Sending message to demo-topic :: %s", message));
        template.send("demo-topic" , message);

    }
}
