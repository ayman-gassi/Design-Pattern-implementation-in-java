public class PizzaVegetarienne implements Pizza{
    @Override
    public void Preparer() {
        System.out.println("Preparer Pizza Veg");
    }

    @Override
    public void Cuire() {
        System.out.println("Cuire Pizza Veg");
    }

    @Override
    public void Couper() {
        System.out.println("Couper Pizza Veg");
    }

    @Override
    public void Emballer() {
        System.out.println("Emballer Pizza Veg");
    }
}
