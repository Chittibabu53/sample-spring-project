package org.example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessagePrinter {

    private final MessageProvider messageProvider;

    @Autowired
    public MessagePrinter(MessageProvider messageProvider) {
        this.messageProvider = messageProvider;
    }

    public void printMessage() {
        System.out.println(messageProvider.getMessage());
    }

}
