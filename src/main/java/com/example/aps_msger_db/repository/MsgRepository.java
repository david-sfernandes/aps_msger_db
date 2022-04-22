package com.example.aps_msger_db.repository;

import com.example.aps_msger_db.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MsgRepository extends JpaRepository<Message, Long> {}
