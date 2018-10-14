package io.borlandfcsd.template;

import io.borlandfcsd.template.entity.Message;
import io.borlandfcsd.template.repository.MessageRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.util.stream.Stream;

@SpringBootApplication
public class TemplateApplication {
	public static void main(String[] args) {
		SpringApplication.run(TemplateApplication.class, args);
	}
}
