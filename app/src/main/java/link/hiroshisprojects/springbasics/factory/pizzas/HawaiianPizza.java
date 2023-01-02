package link.hiroshisprojects.springbasics.factory.pizzas;

public class HawaiianPizza extends Pizza{
    @Override
    public void addIngredients() {
        System.out.println("Adding pineapple to the pizza...");
    }
}
