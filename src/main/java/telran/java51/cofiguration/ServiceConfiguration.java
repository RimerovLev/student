package telran.java51.cofiguration;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.AccessLevel;

@Configuration
public class ServiceConfiguration {

	@Bean
	public ModelMapper getModelMapper() {
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration()
							.setFieldMatchingEnabled(true)
						    	
							.setMatchingStrategy(MatchingStrategies.STRICT);
							
		return modelMapper;
	}
}
