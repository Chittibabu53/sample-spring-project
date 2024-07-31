package org.example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
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


    @Autowired
    private ApplicationContext applicationContext;

    public void singleTonScope(){

        MyPrototypeBean bean1 = applicationContext.getBean(MyPrototypeBean.class);
        MyPrototypeBean bean2 = applicationContext.getBean(MyPrototypeBean.class);


        System.out.println("Bean 1: " + bean1);
        System.out.println("Bean 2: " + bean2);

        // Check if they are different instances
        System.out.println("Are both beans different instances? " + (bean1 != bean2));

    }

}
