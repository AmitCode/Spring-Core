package com.ioc.container;

public class Animal implements Doing{
    @Override
    public void eat() {
        System.out.println("Animal is eating!...");
    }
    public void run(){
        System.out.println("Animal is running!...");
    }
}
