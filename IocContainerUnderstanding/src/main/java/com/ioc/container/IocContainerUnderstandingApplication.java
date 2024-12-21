package com.ioc.container;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@SpringBootApplication
public class IocContainerUnderstandingApplication {

	public static void main(String[] args) {
		SpringApplication.run(IocContainerUnderstandingApplication.class, args);
//		Resource resource = new ClassPathResource("config.xml");
		BeanFactory factory = new ClassPathXmlApplicationContext("config.xml");
//		Animal animal = (Animal) factory.getBean("do");
//		animal.eat();
		//ApplicationContext factory = new ClassPathXmlApplicationContext("config.xml");
		Doing doing = factory.getBean("do",Doing.class);
		doing.eat();
		doing.run();


	}

}
