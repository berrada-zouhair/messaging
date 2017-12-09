package com.messaging.infrastructure;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.messaging.application.dto.MessageInputDTO;
import com.messaging.domain.model.Message;
import com.messaging.domain.repository.MessageRepository;
import com.messaging.domain.service.MessageService;


//@AllArgsConstructor
@Service
public class MessageServiceImpl implements MessageService {
	
	private MessageRepository repository;
	
	@Autowired
	public MessageServiceImpl(MessageRepository repository) {
		this.repository = repository;
	}

	@Override
	public Message addMessage(MessageInputDTO dto) {
		Message message = new Message(null, new Date(), dto.getText());
		return repository.save(message);
	}

	@Override
	public List<Message> getMessages() {
		return repository.findAll();
	}

}
