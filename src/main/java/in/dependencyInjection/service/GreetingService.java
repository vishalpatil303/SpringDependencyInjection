package in.dependencyInjection.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class GreetingService implements MyService{

	@Override
	public String sayHello() {
		
		return " Hello from Greeting Service";
	}

}
