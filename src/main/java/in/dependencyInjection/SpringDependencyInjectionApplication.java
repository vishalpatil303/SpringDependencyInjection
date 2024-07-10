package in.dependencyInjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.dependencyInjection.controller.EnvironmentController;
import in.dependencyInjection.controller.LanguageController;

@SpringBootApplication
public class SpringDependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =  SpringApplication.run(SpringDependencyInjectionApplication.class, args);
		EnvironmentController ec = ctx.getBean(EnvironmentController.class);
		ec.printEnvironmentName();
		LanguageController lc =  ctx.getBean(LanguageController.class);
		lc.printMsg();
	}

}
