package com.applicationContextJavaBased;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class ApplicationContextJavaBasedApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationContextJavaBasedApplication.class, args);
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		UserInfo userInfo = (UserInfo) applicationContext.getBean(UserInfo.class);
		System.out.println("User Name : " +userInfo.userName);
		
	}

}
