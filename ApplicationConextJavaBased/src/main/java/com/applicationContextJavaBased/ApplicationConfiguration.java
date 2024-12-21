package com.applicationContextJavaBased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {
@Bean
    public UserInfo getUserBean(String name,int age,String id){
    return new UserInfo("Amit Kumar Pandey","0001232323",25);
    }
}
