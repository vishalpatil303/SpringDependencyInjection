package in.dependencyInjection.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import in.dependencyInjection.service.MyService;

@Controller
public class PropertyInjectionController {

	
	
	@Autowired
	private MyService myService;
	
	public void pringMassage() {
		System.out.println("in Controller "+ PropertyInjectionController.class);
		System.out.println(myService.sayHello());
	}
}
