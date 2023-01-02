package link.hiroshisprojects.springbasics.factory;

import link.hiroshisprojects.springbasics.factory.pizzafactory.PizzaFactory;
import link.hiroshisprojects.springbasics.factory.pizzas.CheesePizza;
import link.hiroshisprojects.springbasics.factory.pizzas.HawaiianPizza;
import link.hiroshisprojects.springbasics.factory.pizzas.PepperoniPizza;
import org.junit.jupiter.api.Test;

public class FactoryTest {
    @Test void whenPizzaFactoryMethods_thenCorrectPizzaTypes() {
        PizzaFactory factory = new PizzaFactory();
        assert CheesePizza.class.equals(factory.createPizza("cheese").getClass());
        assert PepperoniPizza.class.equals(factory.createPizza("pepperoni").getClass());
        assert HawaiianPizza.class.equals(factory.createPizza("hawaiian").getClass());
    }

}
