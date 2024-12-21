package com.appContextXMLBased;

public class UserInfo {
    int userId;
    String userName;
    int userAge;

    public UserInfo(int id,String name,int age){
        this.userId=id;
        this.userName=name;
        this.userAge=age;
    }

    public void start() {
        System.out.println("Bean Initiated!...");
    }

    public void end(){
        System.out.println("Bean Destroyed!...");
    }
}
