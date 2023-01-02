package link.hiroshisprojects.springbasics.factory.pizzas;

public class CheesePizza extends Pizza{
    @Override
    public void addIngredients() {
        System.out.println("Adding cheese to the pizza...");
    }
}
