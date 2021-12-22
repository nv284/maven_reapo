package com.maven.demo1;

public class Emp {
private String emp_name;
private String emp_id;

public void setEmp_name(String emp_name) {
	this.emp_name = emp_name;
}

public void setEmp_id(String emp_id) {
	this.emp_id = emp_id;
}


public void printInfo() {
	System.out.println("Employee Name : "+ emp_name +"  "+" Employee Id "+emp_id);
}

}
