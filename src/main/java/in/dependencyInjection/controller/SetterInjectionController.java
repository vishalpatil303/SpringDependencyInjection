package in.dependencyInjection.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import in.dependencyInjection.service.MyService;

@Controller
public class SetterInjectionController {

	private  MyService myService;
	
	@Autowired
	public void setMyService(MyService myService) {
		System.out.println("in setter");
		this.myService = myService;
	}
	
	
	public void pringMassage() {
		System.out.println("in Controller "+ SetterInjectionController.class);
		System.out.println(myService.sayHello());
	}
}
