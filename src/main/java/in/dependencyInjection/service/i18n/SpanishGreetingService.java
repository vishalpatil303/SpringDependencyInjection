package in.dependencyInjection.service.i18n;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import in.dependencyInjection.service.MyService;

@Profile("sp")
@Service("i18NService")
public class SpanishGreetingService implements MyService{

	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		return "Holla From Spanish Greeting Service";
	}

}
