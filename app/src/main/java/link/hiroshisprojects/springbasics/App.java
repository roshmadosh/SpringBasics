package link.hiroshisprojects.springbasics;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        // XML based config, old-school.
        ApplicationContext ctx = new ClassPathXmlApplicationContext("xml/cat-service.xml");
    }
}
