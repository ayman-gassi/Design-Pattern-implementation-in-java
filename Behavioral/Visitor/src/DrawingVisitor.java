public class DrawingVisitor implements Visitor {
    @Override
    public void visit(Circle circle) {
        System.out.println("Drawing Circle with radius " + circle.getRadius());
    }

    @Override
    public void visit(Square square) {
        System.out.println("Drawing Square with side " + square.getSide());
    }
}