package com.dep.construtor;

import org.springframework.stereotype.Component;

@Component
public class ManagerClass implements EmpInterface {
Accountant acc;

	public ManagerClass(Accountant acc) {
	super();
	System.out.println("Manager construtor ");
	this.acc = acc;
}

	@Override
	public void doWork() {
		// TODO Auto-generated method stub
System.out.println(" Employee is a Manager ");
	}

	@Override
	public void JobDetail() {
		// TODO Auto-generated method stub
System.out.println(" Manager will manage respective department work ");
	}
public void callMeeting() {
	acc.doWork();
	acc.JobDetail();
}
}
