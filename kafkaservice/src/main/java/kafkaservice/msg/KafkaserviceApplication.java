package kafkaservice.msg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class KafkaserviceApplication {
	
	/*
	 * @Bean Producer getProducerBean() { return new Producer(); }
	 */
	public static void main(String[] args) {
		SpringApplication.run(KafkaserviceApplication.class, args);
	}

}
