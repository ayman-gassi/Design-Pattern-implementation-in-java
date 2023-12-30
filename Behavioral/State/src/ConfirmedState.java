public class ConfirmedState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Order is in Confirmed state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Confirmed State";
    }
}