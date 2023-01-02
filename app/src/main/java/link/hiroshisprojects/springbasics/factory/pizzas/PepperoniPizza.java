package link.hiroshisprojects.springbasics.factory.pizzas;

public class PepperoniPizza extends Pizza {
    @Override
    public void addIngredients() {
        System.out.println("Adding pepperoni slices to the pizza...");
    }
}
