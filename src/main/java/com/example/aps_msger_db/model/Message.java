package com.example.aps_msger_db.model;

import lombok.*;

import javax.persistence.*;

@Getter @Setter
@Entity @Builder
@AllArgsConstructor
@NoArgsConstructor
public class Message {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private String msg;
}