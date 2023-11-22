public class Delivered implements State {
    Pizza pizza;
    public Delivered(Pizza newPizza) {
        this.pizza = newPizza;
    }
    public void bake() {
        System.out.println("Can't deliver a pizza not baked yet");
    }
    public void deliver() {
        System.out.println("Can't deliver a pizza already delivered");
    }
}