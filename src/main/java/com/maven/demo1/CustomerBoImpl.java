package com.maven.demo1;

public class CustomerBoImpl implements CustomerBo {

	@Override
	public void addCustomer() {
		// TODO Auto-generated method stub
System.out.println("Addcustomer () is running ");
	}

	@Override
	public String addCustomerReturnValue() {
		// TODO Auto-generated method stub
		
		System.out.println("addcustomerreturnvalue() is running ");
		return "abc" ;
	}

	@Override
	public void addCustomerThrowException() throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void addCustomerAround(String name) {
		// TODO Auto-generated method stub
System.out.println("Running ....");
	}

}
