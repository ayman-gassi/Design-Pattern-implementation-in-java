import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        Vehicle car =  new Car();
        vehicles.add(car);
        Bicycle bicycle = new Bicycle();
        Vehicle bicycleAdapter = new BicycleAdapter(bicycle);
        vehicles.add(bicycleAdapter);
        for (Vehicle item:vehicles) {
            item.accelerate();
        }
    }
}