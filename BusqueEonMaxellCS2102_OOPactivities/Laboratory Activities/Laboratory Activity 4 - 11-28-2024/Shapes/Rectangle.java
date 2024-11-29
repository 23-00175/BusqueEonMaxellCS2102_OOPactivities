public class Rectangle implements Shape {
    private double length;
    private double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        double A = length * width;
        return A;
    }

    public double getPerimeter() {
        double P = (2 * length) + (2 * width);
        return P;
    }

    public void printShapeType() {
        System.out.println("Rectangle");
    }
}
