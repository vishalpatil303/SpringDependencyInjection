package in.dependencyInjection.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles({"sp","prod"})
@SpringBootTest
class EnvironmentControllerTest {

	@Autowired
	private EnvironmentController environmentController;
	
	
	@Test
	void test() {
		environmentController.printEnvironmentName();
	}

}
