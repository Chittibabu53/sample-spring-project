package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class MyPrototypeBean {

    private final String id;

    public MyPrototypeBean() {
        this.id = java.util.UUID.randomUUID().toString(); // Unique ID for each instance
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "MyPrototypeBean{id='" + id + "'}";
    }
}
