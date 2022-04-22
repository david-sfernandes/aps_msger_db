package com.example.aps_msger_db.controller;

import com.example.aps_msger_db.model.MessageDto;
import com.example.aps_msger_db.service.MsgService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin @RestController
@RequestMapping("/api") @AllArgsConstructor(onConstructor = @__(@Autowired))
public class MsgController {
    MsgService service;

    @PostMapping @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody String message) {
        System.out.println("New message saved.");
        MessageDto dto = new MessageDto(null, message);
        service.save(dto);
    }

    @GetMapping
    public List<MessageDto> getAll() {
        System.out.println("Get all messages");
        return service.getAll();
    }

    @DeleteMapping("/deleteall") @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteAll() {
        service.deleteAll();
    }
}
