
public class Car {
    private String color;
    private double price;
    private char size;

    public Car(String color, double price, char size) {
        this.color = color;
        this.price = price;
        this.size = Character.toUpperCase(size);
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public char getSize() {
        return size;
    }

    public void setColor(String color) {
        this.color = getColor();
    }

    public void setPrice(double price) {
        this.price = getPrice();
    }

    public void setSize(char size) {
        this.size = getSize();
    }

    public String toString() {
        String size_descriptor;
        switch (size) {
            case 'S':
                size_descriptor = "small";
                break;
            case 'M':
                size_descriptor = "medium";
                break;
            case 'L':
                size_descriptor = "large";
                break;
            default:
                size_descriptor = "unknown";
        }
        return "Car (" + color + ") - P" + String.format("%.2f", price) + " - " + size_descriptor;
    }

    public static void main(String[] args) {
        Car car1 = new Car("red", 19999.85, 'M');
        System.out.println(car1.toString());
    }
}

