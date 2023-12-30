public class AreaCalculator implements Visitor {
    double totalArea = 0;

    @Override
    public void visit(Circle circle) {
        totalArea += Math.PI * circle.getRadius() * circle.getRadius();
    }

    @Override
    public void visit(Square square) {
        totalArea += square.getSide() * square.getSide();
    }

    public double getTotalArea() {
        return totalArea;
    }
}