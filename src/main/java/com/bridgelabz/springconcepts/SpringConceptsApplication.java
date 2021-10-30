package com.bridgelabz.springconcepts;

import com.bridgelabz.springconcepts.component.DemoBean;
import com.bridgelabz.springconcepts.component.EmployeeBean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringConceptsApplication {

	public static final Logger logger = LoggerFactory.getLogger(SpringConceptsApplication.class);

	public static void main(String[] args) {

		logger.debug("Welcome to spring concept demo");
		System.out.println();
		ApplicationContext context = SpringApplication.run(SpringConceptsApplication.class, args);
		System.out.println();
		logger.debug("Checking context: ={}",context.getBean(DemoBean.class));
		System.out.println();
		EmployeeBean employeeBean = context.getBean(EmployeeBean.class);
		employeeBean.setEid(104);
		employeeBean.setEname("Spring Framework Guru");
		employeeBean.showEmployeeDetails();
	}
}
