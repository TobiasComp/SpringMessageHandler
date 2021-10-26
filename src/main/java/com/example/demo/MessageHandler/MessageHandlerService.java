package com.example.demo.MessageHandler;

import com.example.demo.mixedNumbers.*;
import com.example.demo.mixedNumbers.Number;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MessageHandlerService {
    public Message send(Message msg) throws ClassCastException {

        if (PlainNumber.isValid(msg.getMessage()) || HexadecimalNumber.isValid(msg.getMessage())
                || Fraction.isValid(msg.getMessage())) {
            Number number = NumberFactory.getNumberType(msg.getMessage());
            sendMessage(number);
            return new Message(msg.getMessage());
        } else {
            throw new ClassCastException("Invalid data");
        }
    }

    public void sendMessage(Number number) {

            final String uri = "http://localhost:8081/output/messages";

            RestTemplate restTemplate = new RestTemplate();
            Number result = restTemplate.postForObject(uri, number, Number.class);

            System.out.println(result);
        }
}
