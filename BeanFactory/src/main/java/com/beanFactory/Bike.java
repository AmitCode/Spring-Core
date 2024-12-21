package com.beanFactory;

public class Bike implements BehaviourClass{
    public void run(){
        System.out.println("Bik is running!...");
    }

    public void name(String name){
        System.out.println("Bike name is : " +name);
    }
}
