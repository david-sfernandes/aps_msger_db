package com.example.aps_msger_db.model;

import org.springframework.stereotype.Component;
@Component
public class ModelMapper {
    public Message toEntity(MessageDto dto) {
        return new Message(dto.getId(), dto.getMsg());
    }

    public MessageDto toDto(Message msg) {
        return new MessageDto(msg.getId(), msg.getMsg());
    }
}
