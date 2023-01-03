package link.hiroshisprojects.springbasics.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifecycleMain {
    public static void main(String[] args) {
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("lifecycle/config.xml");

        // init() method called after properties are set (i.e. post-DI, both constructor and setter).
        PreLifecycle pre = ctx.getBean("prelifecycle", PreLifecycle.class);

    }
}
