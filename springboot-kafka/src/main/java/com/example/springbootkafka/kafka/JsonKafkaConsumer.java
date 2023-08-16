package com.example.springbootkafka.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.example.springbootkafka.payload.User;

@Service
public class JsonKafkaConsumer {

	private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);
	
	@KafkaListener(topics="json-topic-example", groupId = "myGroup")
	public void consume(User user) {
		// JsonDeserializer will conver the Json object to User object
		LOGGER.info(String.format("JSon Message received -> %s", user.toString()));
	}
}
