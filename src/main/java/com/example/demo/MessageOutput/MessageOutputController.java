package com.example.demo.MessageOutput;

import com.example.demo.mixedNumbers.Number;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageOutputController {

    @Autowired
    private MessageOutputService service;

    @PostMapping(value = "/output/messages", headers = "Accept=application/json")
    public Number outputMessage(@RequestBody Number number) {
        service.processNumber(number);

        return number;
    }

}
