// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Dacia");
        car1.go();

        Car car2 = (Car) car1.clone();
        car2.setModel("BMW");
        car2.go();

    }
}