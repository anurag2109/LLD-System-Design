package wikimedia.kafka.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootProducerApplication implements CommandLineRunner{
	public static void main(String[] args) throws Exception {
		SpringApplication.run(SpringBootProducerApplication.class, args);
	}
	
	@Autowired
	private WikimediaProducer wikimediaProducer;

	@Override
	public void run(String... args) throws Exception {
		wikimediaProducer.sendMessage();
	}

}
