package io.borlandfcsd.template.repository;

import io.borlandfcsd.template.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message,Long> {
}
