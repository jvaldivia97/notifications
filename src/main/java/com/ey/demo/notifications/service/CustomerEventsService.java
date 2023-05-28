package com.ey.demo.notifications.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class CustomerEventsService {

    @KafkaListener(topics = "${topic.name}",
            groupId = "${group.id}")
    public void consumer (String message){
        log.info("message  received: " + message);
    }
}
