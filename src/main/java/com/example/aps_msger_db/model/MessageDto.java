package com.example.aps_msger_db.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class MessageDto implements Serializable {
    private final Long id;
    private final String msg;
}
