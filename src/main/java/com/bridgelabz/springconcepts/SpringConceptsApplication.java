package com.bridgelabz.springconcepts;

import com.bridgelabz.springconcepts.component.DemoBean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringConceptsApplication {

	public static void main(String[] args) {
		System.out.println("Welcome to spring concept demo");
		System.out.println();
		ApplicationContext context = SpringApplication.run(SpringConceptsApplication.class, args);
		DemoBean demoBean = context.getBean(DemoBean.class);
		System.out.println();
		System.out.println("Demo Bean ="+demoBean.toString());
	}
}
