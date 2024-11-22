public class Painter extends Artist {

    enum Type {
        OIL,
        WATERCOLOR,
        ACRYLIC,
        PENCIL,
        CHARCOAL
    }

    private Type medium;

    public Painter (String name, String nationality, int age, String specialty, Type medium) {
        super(name, nationality, age, specialty);
        this.medium = medium;
    }

    // getter method for Painter
    public Type getmedium() {
        return medium;
    }

    // setter method for Painter
    public void setmedium(Type medium) {
        this.medium = medium;
    }

    // displays info for Painter
    public void displayInfo() {
        System.out.println("Painter's Info:");
        super.displayInfo();
        System.out.println("Medium: " + medium);
    }
}
