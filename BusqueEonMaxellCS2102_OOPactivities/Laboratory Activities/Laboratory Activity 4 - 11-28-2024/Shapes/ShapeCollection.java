public class ShapeCollection {
    private Shape[] shapes;
    
        ShapeCollection(Shape[] shapes) {
        this.shapes = shapes;
    }

    public void getPropertyValues() {
        for (Shape shape : shapes) {
            shape.printShapeType();
            System.out.println(String.format("Area: %.2f", shape.getArea()));
            System.out.println(String.format("Perimeter: %.2f", shape.getPerimeter()));
            System.out.println();
        };
    }
}
