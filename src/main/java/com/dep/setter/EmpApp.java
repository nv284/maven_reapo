package com.dep.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext con = new ClassPathXmlApplicationContext("setterdep.xml");
Employee e = (Employee) con.getBean("emp");
e.disp();
	}

}
