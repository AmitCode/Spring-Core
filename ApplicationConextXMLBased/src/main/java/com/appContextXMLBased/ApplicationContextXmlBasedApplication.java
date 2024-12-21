package com.appContextXMLBased;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class ApplicationContextXmlBasedApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationContextXmlBasedApplication.class, args);
		ApplicationContext appContext = new ClassPathXmlApplicationContext("AppConfig.xml");
		UserInfo info = (UserInfo) appContext.getBean("userInfo1");
		System.out.println("UserId ::" +info.userId+ ", UserName :: " +info.userName+ ", User Age :: " +info.userAge);
		info.end();
		System.out.println("Check if Bean Exist : " +info.userName);
	}

}
