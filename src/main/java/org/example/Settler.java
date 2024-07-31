package org.example;

import org.springframework.beans.factory.annotation.Autowired;

public class Settler {


    private SetterInjection setterInjection;


    @Autowired
    public void setSetterInjection(SetterInjection setterInjection) {
        this.setterInjection = setterInjection;
    }

    public void printSettlerInjection(){
        System.out.println(setterInjection.print());
    }
}
