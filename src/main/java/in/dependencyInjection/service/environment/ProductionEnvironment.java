package in.dependencyInjection.service.environment;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile("prod")
@Service
public class ProductionEnvironment implements EnvironmentService{

	@Override
	public String getEnvironmentName() {
		
		return "Production Environment Service";
	}

}
