package com.messaging.domain.service;

import java.util.List;

import com.messaging.application.dto.MessageInputDTO;
import com.messaging.domain.model.Message;

public interface MessageService {
	
	public Message addMessage( MessageInputDTO dto );

	public List<Message> getMessages();

}
