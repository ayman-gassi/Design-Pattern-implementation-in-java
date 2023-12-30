
public class Main {
    public static void main(String[] args) {
        Magazine magazine = new Magazine();
        Observer subscriber1 = new MagazineSubscriber("Ayman");
        Observer subscriber2 = new MagazineSubscriber("Zakaria");
        magazine.registerObserver(subscriber1);
        magazine.registerObserver(subscriber2);
        magazine.publishNewIssue("Issue 1");
        magazine.publishNewIssue("Issue 2");
        magazine.removeObserver(subscriber2);
        magazine.publishNewIssue("Issue 3");
    }
}