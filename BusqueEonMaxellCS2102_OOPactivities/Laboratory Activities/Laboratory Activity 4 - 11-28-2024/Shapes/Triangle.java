
public class Triangle implements Shape {
    private double a;
    private double b;
    private double c;

    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getArea() {
        double s = (a + b + c) / 2;
        double A = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return A;
    }

    public double getPerimeter() {
        double P = a + b  + c;
        return P;
    }

    public void printShapeType() {
        System.out.println("Triangle");
    }
}
