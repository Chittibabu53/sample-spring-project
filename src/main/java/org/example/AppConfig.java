// AppConfig.java
package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example")
public class AppConfig {
    private  String state;
    private String City;

    @Bean
    public MyBean myBean() {
        return new MyBean();
    }
    @Bean
    public LocalBean myLocalBean(){
        return  new LocalBean();
    }
    public LocalBean myLocalBeans(){
        return new LocalBean();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }
}
