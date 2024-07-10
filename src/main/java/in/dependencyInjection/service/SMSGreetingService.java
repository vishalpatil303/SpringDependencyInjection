package in.dependencyInjection.service;

import org.springframework.stereotype.Service;

@Service("smsGreetingService")
public class SMSGreetingService implements MyService {

	@Override
	public String sayHello() {
	
		return " Hello From SMS Greeting Service ";
	}

}
