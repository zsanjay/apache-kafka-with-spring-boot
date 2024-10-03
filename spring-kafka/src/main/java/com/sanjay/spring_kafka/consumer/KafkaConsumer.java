package com.sanjay.spring_kafka.consumer;

import com.sanjay.spring_kafka.domain.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {

    //@KafkaListener(topics = "demo-topic", groupId = "myGroup")
    public void consumeMsg(String message) {
        log.info(String.format("Consuming the message from demo-topic :: %s", message));
    }

    @KafkaListener(topics = "demo-topic", groupId = "myGroup")
    public void consumeJsonMsg(Student student) {
        log.info(String.format("Consuming the message from demo-topic :: %s", student.toString()));
    }
}
