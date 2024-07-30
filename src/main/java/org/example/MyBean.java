// MyBean.java
package org.example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
@Component
public class MyBean {
    public void doSomething() {
        System.out.println("MyBean is doing something!");
    }

    MyBean(){

    }
    private DataSource dataSource;

    @Autowired
    public MyBean(DataSource dataSource) {
        this.dataSource = dataSource;
    }

}
