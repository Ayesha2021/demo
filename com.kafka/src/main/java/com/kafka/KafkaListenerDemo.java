package com.kafka;

import org.springframework.stereotype.Component;
import org.springframework.kafka.annotation.KafkaListener;

@Component
public class KafkaListenerDemo {
	
	@KafkaListener(groupId = "group_id", topics = "TestTopic", 	containerFactory = "kafkaListenerContainerFactory")
	public void receivedMessage(String message) {
		System.out.println("Message Received using Kafka listener " + message);
	}
}	


