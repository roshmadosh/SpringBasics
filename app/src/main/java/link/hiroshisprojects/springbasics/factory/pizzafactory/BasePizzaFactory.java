package link.hiroshisprojects.springbasics.factory.pizzafactory;

import link.hiroshisprojects.springbasics.factory.pizzas.Pizza;

public abstract class BasePizzaFactory {
    public abstract Pizza createPizza(String type);
}
