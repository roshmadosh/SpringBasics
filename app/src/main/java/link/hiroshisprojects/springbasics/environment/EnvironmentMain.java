package link.hiroshisprojects.springbasics.environment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class EnvironmentMain {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = 
			new AnnotationConfigApplicationContext();

		ctx.getEnvironment().setActiveProfiles("development");
		
		ctx.register(Config.class);

		ctx.refresh();

		// this should print the DEV message
		EnvClass myClass = ctx.getBean(EnvClass.class);

		DataSource dataSource = ctx.getBean(DataSource.class);
		
	}
}

