package kafkaservice.msg.service;

import kafkaservice.msg.model.Message;

public interface Producer {

	public String sendMessage(String message);

}
