package in.dependencyInjection.service.environment;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile("preProd")
@Service
public class PreProductionEnvironmentService implements EnvironmentService {

	@Override
	public String getEnvironmentName() {
		// TODO Auto-generated method stub
		return " PreProduction Environment Service";
	}

}
