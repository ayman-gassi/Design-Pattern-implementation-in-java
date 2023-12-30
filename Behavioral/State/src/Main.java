
public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        State waitingState = new WaitingState();
        waitingState.doAction(context);
        System.out.println("Current state: " + context.getState());
        State confirmedState = new ConfirmedState();
        confirmedState.doAction(context);
        System.out.println("Current state: " + context.getState());
    }
}