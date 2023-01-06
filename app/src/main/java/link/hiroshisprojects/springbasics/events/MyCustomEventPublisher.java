package link.hiroshisprojects.springbasics.events;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;


@Component
class MyCustomEventPublisher {
	@Autowired
	private ApplicationEventPublisher applicationEventPublisher;

	public void publishMyCustomEvent(String message) {
		System.out.println("Publishing custom event...");
		MyCustomEvent event = new MyCustomEvent(this, message);
		applicationEventPublisher.publishEvent(event);
	}
}
