package link.hiroshisprojects.springbasics.beanpostprocessor;

import org.springframework.beans.factory.config.BeanPostProcessor;

public class InstantiationTracingBPP implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object bean, String beanName) {
        System.out.println("BEFORE INITIALIZING " + beanName);
        return bean;
    }
    public Object postProcessAfterInitialization(Object bean, String beanName) {
        System.out.println("AFTER INITIALIZING " + beanName);
        return bean;
    }
}
