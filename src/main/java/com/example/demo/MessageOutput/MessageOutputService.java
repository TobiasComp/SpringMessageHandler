package com.example.demo.MessageOutput;

import com.example.demo.mixedNumbers.Number;
import org.springframework.stereotype.Service;

import java.io.PrintStream;

@Service
public class MessageOutputService {

    static Float total = Float.valueOf(0);

    public void processNumber(Number number) {
        total += number.getValue();
        printNumber(number, System.out);
    }

    public void printNumber(Number number, PrintStream stream) {
        System.setOut(stream);
        System.out.println(number.getOriginalForm() + " " + total);
        System.out.flush();
    }

}
