package link.hiroshisprojects.springbasics.aop;

import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@Aspect
class LoggingAspect {
	
	private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

	@Pointcut("execution(* *..create*(..))")
	public void createMethods() {}

	@AfterReturning(value = "createMethods()", returning = "entity")
	public void logEntityCreation(JoinPoint jp, Object entity) throws Throwable {
		logger.info(entity.getClass().getName() + " created from " + jp.getSignature().getName());
	}
}
