package in.dependencyInjection.service.i18n;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import in.dependencyInjection.service.MyService;

@Profile({"en","default"})
@Service("i18NService")
public class EnglishGreetingService implements MyService {

	@Override
	public String sayHello() {
		
		return " Hello From English Greeting Service";
	}

}
