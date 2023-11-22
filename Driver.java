public class Driver {
    public static void main(String[] args) {
        int TEST_PIZZA_COUNT = 10;
        Pizza pizza1 = new Pizza();
        //State baked = new Baked(pizza1);
        
        pizza1.deliver();
        pizza1.bake();
        pizza1.bake();
        pizza1.deliver();
        
        for (int i=0; i < TEST_PIZZA_COUNT; i++) {
            System.out.println(i);
            pizza1 = new Pizza();
            pizza1.bake();
            pizza1.deliver();
        }
    }
}