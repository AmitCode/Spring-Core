package com.springDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringDemoProjectApplication {

	public static void main(String[] args) {
		try {
			SpringApplication.run(SpringDemoProjectApplication.class, args);
			ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
			LoanInfoClass object = (LoanInfoClass) applicationContext.getBean("loanInfo");
			System.out.println("Loan Id :: " +object.getLoanId());
			System.out.println("Loan Amount :: " +object.getLoanAmount());
			System.out.println("Loan Amount :: " +object.getLoanAmount());
			System.out.println("Loan Applicant Name :: " +object.getApplicantName());
			System.out.println("Loan Applicant Age :: " +object.getApplicantAge());
			//object.getApplicantName();
		}catch (Exception ex){
			System.out.println("SpringDemoProjectApplication : Exception -> " +ex.getMessage());
		}
	}

}
