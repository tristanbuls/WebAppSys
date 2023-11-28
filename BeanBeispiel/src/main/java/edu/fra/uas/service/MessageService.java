package edu.fra.uas.service;

import org.springframework.stereotype.Component;

@Component
public class MessageService {
    private String message;
    public int counter = 0;
    public String getMessage() {
        return message;
    }
    public int increment()  {
        return ++counter;
    }
    public void setMessage(String message) {
        this.message = message;
    }
}
