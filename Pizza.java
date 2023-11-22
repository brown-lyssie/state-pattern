public class Pizza {
    State baked;
    State cooked;
    State delivered;
    State undeliverable;
    State currentState;
    public Pizza() {
        this.baked = new Baked(this);
        this.baked = new Cooked(this);
        this.baked = new Delivered(this);
        this.baked = new Undeliverable(this);
        this.currentState = cooked;
    }
    // state methods
    public void setState(State newState) {
        this.state = newState;
    }
    // state getters
    public State getBakedState() {
        return this.baked;
    }
    public State getState() {
        return this.currentState;
    }
    public State getCookedState() {
        return this.cooked;
    }
    public State getDeliveredState() {
        return this.delivered;
    }
    public State getUndeliveredState() {
        return this.undelivered;
    }
    // bake and deliver functions
    public void bake() {
        state.bake();
    }
    public void deliver() {
        state.deliver();
    }
}