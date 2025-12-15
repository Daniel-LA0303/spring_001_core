package com.spring.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
//@Scope("prototype")
public class MyService {
	
	@Autowired
	private MyService2 myService2;
	
	public String Service1() {
		return "This is my service1 with method 1";		
	}
	
	public String Service2() {
		
		return myService2.Service2();
	}

}
