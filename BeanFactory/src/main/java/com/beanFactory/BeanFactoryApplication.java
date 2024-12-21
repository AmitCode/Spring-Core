package com.beanFactory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@SpringBootApplication
public class BeanFactoryApplication {

	public static void main(String[] args) {
		try {
			SpringApplication.run(BeanFactoryApplication.class, args);
			//Resource resource = new ClassPathResource("Config.xml");
			//BeanFactory beanFactory  = new XmlB
			BeanFactory beanFactory = new ClassPathXmlApplicationContext("config.xml");
			BehaviourClass behaviourClass = beanFactory.getBean("behaviour",BehaviourClass.class);
			behaviourClass.name("BMW");
			behaviourClass.run();
			//Bean Factory(A type of IOC Container) interface which is used to create, configure beans based dependency
			//injection and manages the life cycle of beans.
			//It is simplest way to configure IOC Container.

			//Factory Bean Method:
			//1.getBean :: Return an instance, which may be shared or independent, of the specified bean.
			//Exception :: No bean named
			try{
				System.out.println("getBean(String name) :: " +beanFactory.getBean("Do").getClass().getName());
			}catch (Exception ex){
				System.out.println("Exception :: "+ex.getMessage());
				System.out.println("Exception :: " +ex.getCause());
				System.out.println("Exception :: " +ex.getClass());
			}

			//2.getAliases :: Return the aliases for the given bean name, if any.
			try{
				System.out.println("getAliases :: " +beanFactory.getAliases("56").toString());
			}catch (Exception ex){
				System.out.println("Exception :: " +ex.getMessage());
//			System.out.println("Exception :: " +ex.getCause());
//			System.out.println("Exception :: " +ex.getClass());
			}

			//3.getBean(Class<T> requiredType)	Return the bean instance that uniquely matches the given object type, if any.
			try{
//			Class<?> People = null;
				System.out.println("getBean(Class<T> requiredType) :: " +beanFactory.getBean(Car.class).getClass().getName());
			}catch (Exception ex){
				System.out.println("Exception getBean(Class<T> requiredType) :: " +ex.getMessage());
			}

			//4.containsBean(String name) :Returns true or false based on match
			try{
				System.out.println("containsBean(String name) :: " +beanFactory.getBean("Do").getClass().getName());
			}catch (Exception ex){
				System.out.println("Exception :: "+ex.getMessage());
				System.out.println("Exception :: " +ex.getCause());
				System.out.println("Exception :: " +ex.getClass());
			}
		}catch (Exception ex){
			System.out.println("BeanFactoryApplication :: Exception -> " +ex);
		}
	}

}
