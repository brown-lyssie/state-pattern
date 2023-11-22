public class Undeliverable implements State {
    Pizza pizza;
    public Undeliverable(Pizza newPizza) {
        pizza = newPizza;
    }
    public void bake() {
        System.out.println("Can't bake an undeliverable pizza");
    }
    public void deliver() {
        System.out.println("Can't deliver an undeliverable pizza");
    }
}