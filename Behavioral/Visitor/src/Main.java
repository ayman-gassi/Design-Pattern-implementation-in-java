
public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape square = new Square(4);

        Visitor areaCalculator = new AreaCalculator();
        circle.accept(areaCalculator);
        square.accept(areaCalculator);

        System.out.println("Total area: " + ((AreaCalculator) areaCalculator).getTotalArea());

        Visitor drawingVisitor = new DrawingVisitor();
        circle.accept(drawingVisitor);
        square.accept(drawingVisitor);
    }
}