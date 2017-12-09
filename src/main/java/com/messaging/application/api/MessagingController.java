package com.messaging.application.api;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.messaging.application.dto.MessageInputDTO;
import com.messaging.domain.model.Message;
import com.messaging.domain.service.MessageService;

@RestController()
public class MessagingController {
	
	private MessageService messageService;
	
	@GetMapping(path="/helloWorld", produces= {MediaType.APPLICATION_JSON_VALUE})
	public @ResponseBody String helloWorld() {
		return "Hello world";
	}
	
	@Autowired
	public MessagingController( MessageService messageService ) {
		this.messageService = messageService;
	}
	
	@GetMapping(path="/messages", produces= {MediaType.APPLICATION_JSON_VALUE})
	public @ResponseBody List<Message> getMassages() {
		return messageService.getMessages();
	}
	
	@PostMapping(path="/messages", produces= {MediaType.APPLICATION_JSON_VALUE})
	public @ResponseBody Message addMassages( @RequestBody MessageInputDTO message ) {
		return messageService.addMessage(message);
	}

}
