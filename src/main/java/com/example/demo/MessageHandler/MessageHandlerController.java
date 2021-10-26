package com.example.demo.MessageHandler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class MessageHandlerController {

    @Autowired
    private MessageHandlerService service;

    @PostMapping(value = "/messages", headers = "Accept=application/json")
    public Message sendMessage(@RequestBody Message msg) throws ResponseStatusException{
        try {
            return service.send(msg);
        } catch ( ClassCastException e) {
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST, "message is not valid!", e
            );
        }
    }

}
