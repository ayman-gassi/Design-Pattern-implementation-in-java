
class WithMilk implements Coffee {
    private final Coffee decoratedCoffee;

    public WithMilk(Coffee decoratedCoffee) {
        this.decoratedCoffee = decoratedCoffee;
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 0.5;
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Milk";
    }
}
