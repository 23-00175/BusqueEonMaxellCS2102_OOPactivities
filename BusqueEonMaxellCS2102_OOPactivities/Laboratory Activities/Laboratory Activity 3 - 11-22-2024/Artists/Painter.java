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
    public Type getMedium() {
        return medium;
    }

    // setter method for Painter
    public void setMedium(Type medium) {
        this.medium = medium;
    }

    // displays info for Painter
    @Override
    public void displayInfo() {
        System.out.println("\n== Painter's Info ==");
        super.displayInfo();
        System.out.println("Medium: " + medium);
    }
}
