package org.example; // Adjust the package name as needed

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.context.ApplicationContext;

@Service
public class MyService {

    @Autowired
    private ApplicationContext applicationContext;

    public void demonstratePrototypeScope() {
        // Request two instances of MyPrototypeBean
        MyPrototypeBean bean1 = applicationContext.getBean(MyPrototypeBean.class);
        MyPrototypeBean bean2 = applicationContext.getBean(MyPrototypeBean.class);

        // Print both beans
        System.out.println("Bean 1: " + bean1);
        System.out.println("Bean 2: " + bean2);

        // Check if they are different instances
        System.out.println("Are both beans different instances? " + (bean1 != bean2));
    }
}
