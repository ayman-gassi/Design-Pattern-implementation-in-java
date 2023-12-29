
public class Main {
    public static void main(String[] args) {
        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println("Cost: " + simpleCoffee.getCost() + ", Description: " + simpleCoffee.getDescription());

        Coffee coffeeWithMilk = new WithMilk(simpleCoffee);
        System.out.println("Cost: " + coffeeWithMilk.getCost() + ", Description: " + coffeeWithMilk.getDescription());

        Coffee coffeeWithMilkAndCaramel = new WithCaramel(coffeeWithMilk);
        System.out.println("Cost: " + coffeeWithMilkAndCaramel.getCost() + ", Description: " + coffeeWithMilkAndCaramel.getDescription());
    }
}