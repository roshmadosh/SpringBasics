package link.hiroshisprojects.springbasics.beanpostprocessor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanPostProcessorMain {
    public static void main(String[] args) {
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("beanpostprocessor/config.xml");

        // BPP logic should be called for each bean created.
        First first = ctx.getBean("first", First.class);
        Second second = ctx.getBean("second", Second.class);
        Third third = ctx.getBean("third", Third.class);
    }
}
