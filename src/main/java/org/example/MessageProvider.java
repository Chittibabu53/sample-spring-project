package org.example;

import org.springframework.stereotype.Component;

@Component
public class MessageProvider {

    public String getMessage() {
        return "Hello from MessageProvider!";
    }
}
