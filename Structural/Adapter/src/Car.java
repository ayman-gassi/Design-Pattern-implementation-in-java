
public class Car implements Vehicle{

    @Override
    public void accelerate() {
        System.out.println("Car is speeding up");
    }

    @Override
    public void brake() {
        System.out.println("Car is applying brakes");
    }
}
