package com.bean.cycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;
@Component
public class Manager implements Employee, InitializingBean, DisposableBean {

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
System.out.println("Perform tasks while destroying of Bean ");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
System.out.println("Perform tasks while initilizing Bean ");
	}

	@Override
	public void Job() {
		// TODO Auto-generated method stub
System.out.println(" Employee do thier own work like manage manage the office ");
	}

}
