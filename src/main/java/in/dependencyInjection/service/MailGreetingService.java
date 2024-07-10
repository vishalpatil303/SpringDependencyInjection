package in.dependencyInjection.service;

import org.springframework.stereotype.Service;

@Service
public class MailGreetingService implements MyService {

	@Override
	public String sayHello() {
		
		return " Hello From Mail Greeting Service";
	}

}
