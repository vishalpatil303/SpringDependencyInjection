package in.dependencyInjection.service.environment;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile("qa")
@Service
public class QualityEnvironmentService implements EnvironmentService {

	@Override
	public String getEnvironmentName() {
		// TODO Auto-generated method stub
		return "Quality Environment Service";
	}

}
