package link.hiroshisprojects.springbasics.xml;

import link.hiroshisprojects.springbasics.cats.CatService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlMain {
    public static void main(String[] args) {
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("xml/cat-service.xml", "xml/cat-dao.xml");

        CatService catService = ctx.getBean("catService", CatService.class);
        catService.feedCats();
    }
}
