package com.maven.demo1;

public interface CustomerBo {
void addCustomer();

String addCustomerReturnValue();
void addCustomerThrowException() throws Exception;
void addCustomerAround(String name);

}
