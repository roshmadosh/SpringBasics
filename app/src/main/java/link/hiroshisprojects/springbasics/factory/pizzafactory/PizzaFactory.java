package link.hiroshisprojects.springbasics.factory.pizzafactory;

import link.hiroshisprojects.springbasics.factory.pizzas.CheesePizza;
import link.hiroshisprojects.springbasics.factory.pizzas.HawaiianPizza;
import link.hiroshisprojects.springbasics.factory.pizzas.PepperoniPizza;
import link.hiroshisprojects.springbasics.factory.pizzas.Pizza;

public class PizzaFactory extends BasePizzaFactory{
    @Override
    public Pizza createPizza(String type) {
        switch (type) {
            case "cheese": {
                System.out.println("Factory-made CHEESE pizza!");
                return new CheesePizza();
            }
            case "pepperoni": {
                System.out.println("Factory-made PEPPERONI pizza!");
                return new PepperoniPizza();
            }
            case "hawaiian": {
                System.out.println("Factory-made HAWAIIAN pizza!");
                return new HawaiianPizza();
            }
            default:
                throw new IllegalArgumentException("We only make cheese, pepperoni, or hawaiian pizza.");
        }
    }
}
