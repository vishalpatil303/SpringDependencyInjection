package in.dependencyInjection.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService implements MyService{

	@Override
	public String sayHello() {
		
		return " Hello from Service";
	}

}
