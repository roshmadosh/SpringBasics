package link.hiroshisprojects.springbasics.factory.pizzas;

public abstract class Pizza {
    public abstract void addIngredients();

    public void bake() {
        System.out.println("Baking the pizza...");
    }
}
