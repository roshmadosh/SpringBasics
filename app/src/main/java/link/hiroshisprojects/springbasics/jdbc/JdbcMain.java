package link.hiroshisprojects.springbasics.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.w3c.dom.ls.LSOutput;

public class JdbcMain {
    public static void main(String[] args) {
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("jdbc/config.xml");

        Datasource datasource = ctx.getBean("datasource", Datasource.class);
        System.out.println("JDBC URL from properties file: " + datasource.getUrl());

    }

}
