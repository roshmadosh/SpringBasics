package link.hiroshisprojects.springbasics.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AnnotationsMain {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx =
                new ClassPathXmlApplicationContext("annotations/config.xml");

        Example example = ctx.getBean("example", Example.class);
        System.out.println(example.getMainCollaborator().getName());
        System.out.println(example.getActionCollaborator().getName());
    }
}
