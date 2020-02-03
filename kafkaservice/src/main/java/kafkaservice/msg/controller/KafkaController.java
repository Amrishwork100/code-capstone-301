package kafkaservice.msg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kafkaservice.msg.model.Message;
import kafkaservice.msg.service.Producer;

@RestController
@RequestMapping(value = "/kafka")
public class KafkaController {
	
	@SuppressWarnings("rawtypes")
	@Autowired
    private Producer producer;

   
    @PostMapping(value ="/publish/{message}")
    public String sendMessageToKafkaTopic(@PathVariable("message") String message) {
    	//producer.sen
    	 return producer.sendMessage(message);
    }
    
   
}