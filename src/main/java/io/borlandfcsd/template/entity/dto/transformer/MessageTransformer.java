package io.borlandfcsd.template.entity.dto.transformer;

import io.borlandfcsd.template.entity.Company;
import io.borlandfcsd.template.entity.Message;
import io.borlandfcsd.template.entity.dto.MessageDto;

import java.time.LocalDateTime;

public class MessageTransformer {

    public static Message convertToMessage(MessageDto dto) {
        Message message = new Message();
        message.setSender(dto.getSender());
        Company company = new Company();
        company.setId(dto.getRecipient());
        message.setRecipient(company);
        message.setMessage(dto.getMessage());
        message.setDateTime(LocalDateTime.now());

        return message;
    }

    public static MessageDto converToMessageDto(Message message){
        MessageDto dto = new MessageDto();
        dto.setSender(message.getSender());
        dto.setRecipient(message.getRecipient().getId());
        dto.setMessage(message.getMessage());
        return dto;
    }
}
