package in.dependencyInjection.controller;


import org.springframework.stereotype.Controller;

import in.dependencyInjection.service.MyService;

@Controller
public class ConstructorInjectionController {

	
	private final MyService myService;
	
	public ConstructorInjectionController(MyService myService) {
		System.out.println("in Constructor");
		this.myService = myService;
	}



	public void pringMassage() {
		System.out.println("in Controller "+ ConstructorInjectionController.class);
		System.out.println(myService.sayHello());
	}
}
