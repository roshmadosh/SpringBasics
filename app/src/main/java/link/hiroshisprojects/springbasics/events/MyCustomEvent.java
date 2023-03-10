package link.hiroshisprojects.springbasics.events;

import org.springframework.context.ApplicationEvent;

class MyCustomEvent extends ApplicationEvent {

	private String message;

	public MyCustomEvent(Object source, String message) {
		super(source);
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
