public class Square implements Shape {
    private double side;

    Square(double side) {
        this.side = side;
    }

    public double getArea() {
        double A = side * side;
        return A;
    }

    public double getPerimeter() {
        double P = 4 * side;
        return P;
    }

    public void printShapeType() {
        System.out.println("Square");
    }
}