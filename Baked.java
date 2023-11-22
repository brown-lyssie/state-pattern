import java.util.Random;
public class Baked implements State {
    Pizza pizza;
    public Baked(Pizza newPizza) {
        pizza = newPizza;
    }
    public void bake() {
        System.out.println("Can't bake a pizza already baked");
    }
    public void deliver() {
        System.out.println("Delivering the pizza...");
        pizza.setState(pizza.getDeliveredState());
    }
}