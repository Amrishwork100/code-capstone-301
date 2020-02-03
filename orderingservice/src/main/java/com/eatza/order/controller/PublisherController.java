/**
 * 
 */
/*
 * package com.eatza.order.controller;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.cloud.stream.annotation.EnableBinding; import
 * org.springframework.cloud.stream.messaging.Source; import
 * org.springframework.messaging.MessageChannel; import
 * org.springframework.messaging.support.MessageBuilder; import
 * org.springframework.web.bind.annotation.PostMapping; import
 * org.springframework.web.bind.annotation.RequestBody; import
 * org.springframework.web.bind.annotation.RestController;
 * 
 * import com.eatza.order.model.MessageData;
 * 
 *//**
	 * @author M1048474
	 *
	 *//*
		 * @RestController
		 * 
		 * @EnableBinding(Source.class) public class PublisherController {
		 * 
		 * 
		 * @Autowired MessageChannel output;
		 * 
		 * @PostMapping("/publish") public MessageData sendMessage(@RequestBody
		 * MessageData msg){ output.send(MessageBuilder.withPayload(msg).build());
		 * return msg;
		 * 
		 * }
		 * 
		 * }
		 */