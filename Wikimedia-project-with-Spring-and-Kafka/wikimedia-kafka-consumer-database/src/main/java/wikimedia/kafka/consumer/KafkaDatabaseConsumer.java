package wikimedia.kafka.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import wikimedia.kafka.consumer.entity.WikimediaData;
import wikimedia.kafka.consumer.repository.WikimediaDataRepository;

@Service
public class KafkaDatabaseConsumer {
	private static final Logger LOGGER = LoggerFactory.getLogger(KafkaDatabaseConsumer.class);
	
	private WikimediaDataRepository dataRepository;
	
	public KafkaDatabaseConsumer(WikimediaDataRepository dataRepository) {
		this.dataRepository = dataRepository;
	}

	@KafkaListener(topics="wikimedia-topic", groupId = "myGroup")
	public void consume(String eventMessage) {
		LOGGER.info(String.format("Event message received -> %s", eventMessage));
		WikimediaData wikimediaData = new WikimediaData();
		wikimediaData.setWikiEventData(eventMessage);
		dataRepository.save(wikimediaData);
	}
	
}