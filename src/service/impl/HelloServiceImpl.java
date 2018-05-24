package service.impl;

import service.HelloService;

public class HelloServiceImpl implements HelloService {

	private String greeting;
	
	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}



	public String sayHello(String name) {
		return greeting+" "+name;
	}

}
