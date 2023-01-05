package link.hiroshisprojects.springbasics.environment;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("environment/db.properties")
class Config {

	@Bean
	@Profile("development")
	public EnvClass devEnvClass() {
		EnvClass envClass = new EnvClass();
		envClass.printMessage("This is a message from DEV class!");
		return envClass;
	}
	@Bean
	@Profile("production")
	public EnvClass prodEnvClass() {
		EnvClass envClass = new EnvClass();
		envClass.printMessage("This is a message from DEV class!");
		return envClass;
	}
	@Bean(initMethod = "init")
	@Profile("development")
	public DataSource dataSource() {
		return new DataSource("db.url");
	}

}

