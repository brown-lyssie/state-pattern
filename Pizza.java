public class Pizza {
    private State baked;
    private State cooked;
    private State delivered;
    private State undeliverable;
    private State currentState;
    public Pizza() {
        baked = new Baked(this);
        cooked = new Cooked(this);
        delivered = new Delivered(this);
        undeliverable = new Undeliverable(this);
        currentState = cooked;
    }
    // state methods
    public void setState(State newState) {
        currentState = newState;
    }
    // state getters
    public State getBakedState() {
        return baked;
    }
    public State getState() {
        return currentState;
    }
    public State getCookedState() {
        return cooked;
    }
    public State getDeliveredState() {
        return delivered;
    }
    public State getUndeliveredState() {
        return undeliverable;
    }
    // bake and deliver functions
    public void bake() {
        currentState.bake();
    }
    public void deliver() {
        currentState.deliver();
    }
}