package com.example.kafka;

import com.example.kafka.utils.ApplicationUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
public class KafkaSubscriberApplication {
	public static void main(String[] args) {
		SpringApplication.run(KafkaSubscriberApplication.class, args);
	}

	@KafkaListener(topics = ApplicationUtil.TOPIC_NAME, groupId = "group_id")
	public void subscribe(String message) {
		System.out.println("Consumed message: " + message);
	}
}
