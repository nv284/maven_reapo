package com.bean.cycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BankApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AnnotationConfigApplicationContext con = new AnnotationConfigApplicationContext(AppConfig.class);
Employee e = (Employee) con.getBean("manager");
e.Job();
con.close();
	}

}
