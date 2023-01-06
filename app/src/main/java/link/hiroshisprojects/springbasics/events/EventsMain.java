package link.hiroshisprojects.springbasics.events;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class EventsMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = 
			new AnnotationConfigApplicationContext();
		
		ctx.register(Config.class);
		ctx.refresh();

		MyCustomEventPublisher pub = ctx.getBean(MyCustomEventPublisher.class); 
		pub.publishMyCustomEvent("Message from Main!");

	}
}
