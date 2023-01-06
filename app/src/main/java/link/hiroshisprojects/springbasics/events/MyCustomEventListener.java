package link.hiroshisprojects.springbasics.events;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
class MyCustomEventListener implements ApplicationListener<MyCustomEvent> {

	@Override
	public void onApplicationEvent(MyCustomEvent event) {
		System.out.println("Event listener received message: " + event.getMessage());	
	}

}
