package org.example;

interface FromSet{

    String print();
}

public class SetterInjection implements FromSet{


    @Override
    public String print() {
        return "world";
    }
}
