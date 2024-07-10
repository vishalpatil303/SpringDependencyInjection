package in.dependencyInjection.service.environment;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"dev","default"})
@Service
public class DevlopmentEnvironmentService implements EnvironmentService {

	@Override
	public String getEnvironmentName() {
		// TODO Auto-generated method stub
		return "Devlopment Environment Service";
	}

}
