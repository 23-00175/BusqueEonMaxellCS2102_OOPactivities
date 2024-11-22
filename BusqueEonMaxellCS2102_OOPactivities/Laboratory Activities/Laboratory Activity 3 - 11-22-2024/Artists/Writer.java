public class Writer extends Artist {
    
    enum Type {
        FICTION,
        NONFICTION,
        POETRY,
        DRAMA
    }

    private Type writingStyle;

    public Writer (String name, String nationality, int age, String specialty, Type writingStyle) {
        super(name, nationality, age, specialty);
        this.writingStyle = writingStyle;
    }

    // getter method for Writer
    public Type getwritingStyle() {
        return writingStyle;
    }

    // setter method for Writer
    public void setwritingStyle(Type writingStyle) {
        this.writingStyle = writingStyle;
    }

    // displays info for Writer
    public void displayInfo() {
        System.out.println("Writer's Info:");
        super.displayInfo();
        System.out.println("Writing Style: " + writingStyle);
    }
}
