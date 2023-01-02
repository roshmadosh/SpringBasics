package link.hiroshisprojects.springbasics.groovy;

import link.hiroshisprojects.springbasics.cats.CatService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericGroovyApplicationContext;

public class GroovyMain {
    public static void main(String[] args) {
        ApplicationContext ctx =
                new GenericGroovyApplicationContext("groovy/beans.groovy");

        CatService catService = ctx.getBean("catService", CatService.class);
        catService.feedCats();
    }
}
