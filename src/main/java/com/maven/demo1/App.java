package com.maven.demo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
  public static void main(String[] args) {
    System.out.println("Hello World!");
    ApplicationContext context = new ClassPathXmlApplicationContext("demo.xml");

/*	HelloWorld obj = (HelloWorld) context.getBean("hello");
	obj.printHello();
	
	Emp e1= (Emp) context.getBean("emp");
	e1.printInfo();*/
	
	CustomerBo bo= (CustomerBo) context.getBean("cust");
	bo.addCustomer();
	
	
  }
}
