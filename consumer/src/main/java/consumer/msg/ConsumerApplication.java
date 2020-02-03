package consumer.msg;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import consumer.msg.model.MessageData;


@EnableBinding(Sink.class)
@SpringBootApplication
public class ConsumerApplication {
	
	private Logger logger=LoggerFactory.getLogger(ConsumerApplication.class);
	
	@StreamListener("input")
	public void receiveMessage(MessageData msg) {
		logger.info("Received message is : " + msg);
	}
	

	public static void main(String[] args) {
		SpringApplication.run(ConsumerApplication.class, args);
	}

}
