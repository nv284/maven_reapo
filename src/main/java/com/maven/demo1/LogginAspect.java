package com.maven.demo1;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LogginAspect {

	@Before("execution(* com.maven.demo1.CustomerBo.addCustomer())")
	public void logBefore(JoinPoint join) {
		System.out.println(" Lofbefore is running ");
		System.out.println("Hijacked "+ join.getSignature().getName());
		System.out.println("***************");
	}
	
	@After("execution(* com.maven.demo1.CustomerBo.addCustomer())")
	public void logAfter(JoinPoint jo) {
		System.out.println("LogAfter is running ");
System.out.println("Hijacked"+ jo.getSignature().getName());
System.out.println("****************");
	}
	
	@Around("execution(* com.maven.demo1.CustomerBo.addCustomerAround(..))")
	   public void logAround(ProceedingJoinPoint joinPoint) throws Throwable {

		System.out.println("logAround() is running!");
		System.out.println("hijacked method : " + joinPoint.getSignature().getName());
		System.out.println("hijacked arguments : " + Arrays.toString(joinPoint.getArgs()));
			
		System.out.println("Around before is running!");
		joinPoint.proceed(); //continue on the intercepted method
		System.out.println("Around after is running!");
			
		System.out.println("******");

}}
