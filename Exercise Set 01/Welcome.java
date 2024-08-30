import java.util.Scanner;

class Welcome {
    public static void main(String[] args) {
        System.out.println("Welcome to CS 211: Object-oriented Programming!");
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter your name: ");
        
        String name = myObj.nextLine();
        System.out.println("This course will be fun, " + name + "!");
    }
}