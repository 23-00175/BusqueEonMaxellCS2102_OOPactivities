public class Dancer extends Artist {
    
    enum Type {
        BALLET,
        HIPHOP,
        JAZZ,
        CONTEMPORARY
    }

    private Type danceStyle;

    public Dancer (String name, String nationality, int age, String specialty, Type danceStyle) {
        super(name, nationality, age, specialty);
        this.danceStyle = danceStyle;
    }

    // getter method for Dancer
    public Type getdanceStyle() {
        return danceStyle;
    }

    // setter method for Dancer
    public void setdanceStyle(Type danceStyle) {
        this.danceStyle = danceStyle;
    }

    // displays info for Dancer
    @Override
    public void displayInfo() {
        System.out.println("\n== Dancer's Info ==");
        super.displayInfo();
        System.out.println("Dance Style: " + danceStyle);
    }
}
