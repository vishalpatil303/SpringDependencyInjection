package in.dependencyInjection.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
class SetterInjectionControllerTest {
	
	private SetterInjectionController controller;
	
	
	@Autowired
	public void setController(SetterInjectionController controller) {
		this.controller = controller;
	}



	@Test
	void test() {
		controller.pringMassage();
	}

}
