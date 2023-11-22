public class Undeliverable implements State {
    Pizza pizza;
    public Cooked(Pizza newPizza) {
        this.pizza = newPizza;
    }
    public void bake() {
        System.out.println("Can't bake an undeliverable pizza");
    }
    public void deliver() {
        System.out.println("Can't deliver an undeliverable pizza");
    }
}