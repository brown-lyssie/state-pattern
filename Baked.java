import Java.util.Random;
public class Baked implements State {
    Pizza pizza;
    Random randomWinner; = new Random(System.currentTimeMillis());
    public Baked(Pizza newPizza) {
        this.pizza = newPizza;
    }
    public void bake() {
        System.out.println("Can't bake a pizza already baked");
        // calculate if the pizza becomes undeliverable
        int nextInt
    }
    public void deliver() {
        System.out.println("Delivering the pizza...");
        this.pizza.setState(this.pizza.getDelivered());
    }
}