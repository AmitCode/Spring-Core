package com.ioc.container;

public class People  implements  Doing{
    @Override
    public void eat(){
        System.out.println("People is eating!....");
    }
    @Override
    public void run(){
        System.out.println("People is running!....");
    }
}
