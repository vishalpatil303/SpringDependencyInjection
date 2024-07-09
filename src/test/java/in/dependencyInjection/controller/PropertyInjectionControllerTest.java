package in.dependencyInjection.controller;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PropertyInjectionControllerTest {

	@Autowired
	PropertyInjectionController propertyInjectionController;
	@Test
	void test() {
		propertyInjectionController.pringMassage();
	}

}
