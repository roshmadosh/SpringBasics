package link.hiroshisprojects.springbasics.aop;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

@Component
class EntityCreator {

	public String makeEntity() {
		return new String("yay");
	}

	public Long createEntity() {
		return new Long("5");
	}

}
