package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Main {
    public static void main(String[] args) {
        // Initialize the ApplicationContext with Java-based configuration
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Retrieve the bean from the context
        MyBean myBean = context.getBean(MyBean.class);

        AppConfig bean=context.getBean(AppConfig.class);

        LocalBean localBean=context.getBean(LocalBean.class);


        // Use the bean
        myBean.doSomething();
        bean.setCity("hyderabad");
        bean.setState("telangana");
        System.out.println(bean.getCity());
        System.out.println(bean.getState());
        localBean.doSomething();




    }

}