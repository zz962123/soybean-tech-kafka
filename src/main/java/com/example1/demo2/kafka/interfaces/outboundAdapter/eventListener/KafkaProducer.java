package com.example1.demo2.kafka.interfaces.outboundAdapter.eventListener;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KafkaProducer {
    private static final String TOPIC = "sample_topic";
    private final KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessgae(String msg) {
        System.out.println(String.format("Produce message : %s", msg));
        kafkaTemplate.send(TOPIC, msg);
    }
}
