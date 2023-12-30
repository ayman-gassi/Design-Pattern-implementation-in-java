import java.util.ArrayList;
import java.util.List;

public class Magazine implements Subject {
    private List<Observer> observers;
    private String latestIssue;

    public Magazine() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(latestIssue);
        }
    }

    public void publishNewIssue(String issue) {
        this.latestIssue = issue;
        notifyObservers();
    }
}