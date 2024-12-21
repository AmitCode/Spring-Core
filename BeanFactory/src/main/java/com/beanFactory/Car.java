package com.beanFactory;

public class Car implements BehaviourClass{
    public void run(){
        System.out.println("Car is running!...");
    }

    public void name(String name){
        System.out.println("Car name is :: " +name);
    }
}
