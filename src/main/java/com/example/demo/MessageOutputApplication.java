package com.example.demo;

import com.example.demo.MessageHandlerApplication;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class MessageOutputApplication {

    public static void main(String[] args) throws JsonProcessingException {
        SpringApplication.run(MessageHandlerApplication.class, args);
    }



}
