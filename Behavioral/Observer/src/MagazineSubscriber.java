public class MagazineSubscriber implements Observer {
    private String name;

    public MagazineSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received the latest issue: " + message);
    }
}