package link.hiroshisprojects.springbasics.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class AopMain {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = 
			new AnnotationConfigApplicationContext();

		ctx.register(AopConfiguration.class);
		ctx.refresh();

		EntityCreator creator = ctx.getBean(EntityCreator.class);
		String s = creator.makeEntity();
		Long l = creator.createEntity();
	}
}
