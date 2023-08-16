package wikimedia.kafka.consumer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import wikimedia.kafka.consumer.entity.WikimediaData;

public interface WikimediaDataRepository extends JpaRepository<WikimediaData, Long> {
	
}
