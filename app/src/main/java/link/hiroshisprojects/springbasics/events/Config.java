package link.hiroshisprojects.springbasics.events;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("link.hiroshisprojects.springbasics")
class Config {

	@Bean
	public MyCustomEventPublisher myCustomEventPublisher() {
		return new MyCustomEventPublisher();
	}
}
