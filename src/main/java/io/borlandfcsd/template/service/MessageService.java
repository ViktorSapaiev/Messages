package io.borlandfcsd.template.service;

import io.borlandfcsd.template.entity.Message;

import java.util.List;

public interface MessageService {
    Message save(Message message);
    List<Message> findAll();
}
