package com.messaging.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.messaging.domain.model.Message;

public interface MessageRepository extends JpaRepository<Message, Long> {

}
