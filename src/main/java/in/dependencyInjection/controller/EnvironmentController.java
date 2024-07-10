package in.dependencyInjection.controller;

import org.springframework.stereotype.Controller;

import in.dependencyInjection.service.environment.EnvironmentService;

@Controller
public class EnvironmentController {

	private final EnvironmentService environmentService;

	public EnvironmentController(EnvironmentService environmentService) {
		super();
		this.environmentService = environmentService;
	}
	
	public void printEnvironmentName() {
		System.out.println("You are in " + environmentService.getEnvironmentName());
	}
}
