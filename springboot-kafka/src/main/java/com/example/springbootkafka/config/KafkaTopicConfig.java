package com.example.springbootkafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {
	@Bean
	public NewTopic topicExample() {
		return TopicBuilder.name("topic-example").build();
	}
	
	@Bean
	public NewTopic jsonTopicExample2() {
		return TopicBuilder.name("json-topic-example").build();
	}
}
