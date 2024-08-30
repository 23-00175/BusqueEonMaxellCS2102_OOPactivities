import java.util.Scanner;

class Tempconvert {
    public static void main(String[] args) {
        System.out.println("Temperature Converter");
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter a Celsius value: ");
     
        float celsius = myObj.nextFloat();
        float fahrenheit = (celsius * 9) /5 + 32;
        System.out.print(String.format("%.2f Celsius", celsius) + " is " + String.format("%.2f Fahrenheit", fahrenheit));
    }
}
