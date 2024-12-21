package com.applicationContextJavaBased;

import org.springframework.boot.autoconfigure.security.SecurityProperties;

public class UserInfo {
    String userName;
    String userId;
    int userAge;

    public UserInfo(String name, String id,int age){
        this.userName = name;
        this.userAge=age;
        this.userId=id;
    }
}
