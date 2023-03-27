package com.example1.demo2.kafka.interfaces.inboundAdapter.eventListener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class KafkaConsumer {

    @KafkaListener(
            topics = "sample_topic",
            groupId = "foo"
    )
    public void listen(String msg) throws IOException {
        System.out.println(String.format("Consumed message : %s", msg));
    }
}