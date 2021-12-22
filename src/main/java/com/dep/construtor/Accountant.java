package com.dep.construtor;

import org.springframework.stereotype.Component;

@Component
public class Accountant implements EmpInterface {

	public Accountant() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println(" Inside the Accountant construtor ");
	}

	@Override
	public void doWork() {
		// TODO Auto-generated method stub
System.out.println(" Inside Accountant Job profile ");
	}

	@Override
	public void JobDetail() {
		// TODO Auto-generated method stub
System.out.println(" Accountant handle all the account related work ...");
	}

}
