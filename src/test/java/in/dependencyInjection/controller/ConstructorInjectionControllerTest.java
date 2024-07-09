package in.dependencyInjection.controller;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class ConstructorInjectionControllerTest {

	
	private  ConstructorInjectionController constructorInjectionController;
	
	@Autowired
	public ConstructorInjectionControllerTest(ConstructorInjectionController constructorInjectionController) {
		this.constructorInjectionController = constructorInjectionController;
	}


	@Test
	void test() {
		constructorInjectionController.pringMassage();
	}

}
