package io.borlandfcsd.template.service.impl;

import io.borlandfcsd.template.entity.Message;
import io.borlandfcsd.template.repository.MessageRepository;
import io.borlandfcsd.template.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {
    private MessageRepository messageRepository;

    @Autowired
    public MessageServiceImpl(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    @Override
    public Message save(Message message) {
        messageRepository.save(message);
        return message;
    }

    @Override
    public List<Message> findAll() {
        return messageRepository.findAll();
    }

    @Override
    public List<Message> findMessageByRecipientId(Long id) {
        return messageRepository.findMessageByRecipientId(id);
    }
}
