
class WithCaramel implements Coffee {
    private final Coffee decoratedCoffee;

    public WithCaramel(Coffee decoratedCoffee) {
        this.decoratedCoffee = decoratedCoffee;
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 0.7;
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Caramel";
    }
}
