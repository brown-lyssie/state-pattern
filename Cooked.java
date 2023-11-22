public class Cooked implements State {
    Pizza pizza;
    public Cooked(Pizza newPizza) {
        this.pizza = newPizza;
    }
    public void bake() {
        System.out.println("Baking the pizza...");
        this.pizza.setState(this.pizza.getBakedState());
    }
    public void deliver() {
        System.out.println("Can't deliver a pizza not baked yet");
    }
}