package in.dependencyInjection.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import in.dependencyInjection.service.MyService;

@Controller
public class LanguageController {

	
	private final MyService myService;

	
	public LanguageController(@Qualifier("i18NService") MyService myService) {
		super();
		this.myService = myService;
	}
	
	public void printMsg() {
		System.out.println(myService.sayHello());
	}
}
