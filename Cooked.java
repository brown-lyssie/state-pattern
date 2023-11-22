import java.util.Random;
public class Cooked implements State {
    Pizza pizza;
    public Cooked(Pizza newPizza) {
        pizza = newPizza;
    }
    public void bake() {
        System.out.println("Baking the pizza...");
        // calculate if the pizza becomes undeliverable
        Random randomIntGenerator = new Random();
        int randomInt = randomIntGenerator.nextInt(5);
        if (randomInt == 1) {
            pizza.setState(pizza.getUndeliveredState());
        }
        else {
            pizza.setState(pizza.getBakedState());
        }

    }
    public void deliver() {
        System.out.println("Can't deliver a pizza not baked yet");
    }
}