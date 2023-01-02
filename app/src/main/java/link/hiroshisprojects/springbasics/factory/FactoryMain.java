package link.hiroshisprojects.springbasics.factory;

import link.hiroshisprojects.springbasics.factory.pizzafactory.PizzaFactory;
import link.hiroshisprojects.springbasics.factory.pizzas.CheesePizza;
import link.hiroshisprojects.springbasics.factory.pizzas.Pizza;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactoryMain {
    public static void main(String[] args) {
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("factory/pizza-factory.xml");

        Pizza cheese = ctx.getBean("cheesePizza", CheesePizza.class);
        cheese.addIngredients();
    }
}
