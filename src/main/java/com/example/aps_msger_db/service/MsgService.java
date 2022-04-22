package com.example.aps_msger_db.service;

import com.example.aps_msger_db.model.Message;
import com.example.aps_msger_db.model.MessageDto;
import com.example.aps_msger_db.model.ModelMapper;
import com.example.aps_msger_db.repository.MsgRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MsgService {
    @Autowired MsgRepository repository;
    @Autowired ModelMapper mapper;

    @Transactional
    public void save(MessageDto dto) {
        repository.save(mapper.toEntity(dto));
    }

    public List<MessageDto> getAll() {
        List<Message> messages = repository.findAll();
        return messages.stream()
                .map(msg -> mapper.toDto(msg))
                .collect(Collectors.toList());
    }

    public void deleteAll() {
        repository.deleteAll();
    }
}