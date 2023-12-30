public class WaitingState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Order is in Waiting state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Waiting State";
    }
}