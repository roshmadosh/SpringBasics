package link.hiroshisprojects.springbasics.configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigurationMain {

    public static void main(String[] args) {
        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(MyBeans.class);
        BeanA beanA = ctx.getBean(BeanA.class);
        System.out.println(beanA.getName());
//        BeanC beanC = ctx.getBean(BeanC.class);
//        beanC.printMessage();
    }
}
