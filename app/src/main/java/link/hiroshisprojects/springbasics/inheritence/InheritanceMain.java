package link.hiroshisprojects.springbasics.inheritence;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InheritanceMain {
    public static void main(String[] args) {
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("inheritance/config.xml");

        Child child = ctx.getBean("child", Child.class);

        // inherited
        System.out.println("Child's height " + child.getHeight());
        // overwritten
        System.out.println("Child's weight " + child.getWeight());
    }
}
