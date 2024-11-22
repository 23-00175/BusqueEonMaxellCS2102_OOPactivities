public class Singer extends Artist {

    enum Type {
        POP, 
        ROCK, 
        CLASSICAL, 
        JAZZ, 
        HIPHOP, 
        RNB
    }

    private Type genre;

    public Singer (String name, String nationality, int age, String specialty, Type genre) {
        super(name, nationality, age, specialty);
        this.genre = genre;
    }

    // getter method for Singer
    public Type getGenre() {
        return genre;
    }

    // setter method for Singer
    public void setGenre(Type genre) {
        this.genre = genre;
    }

    // displays info for Singer
    @Override
    public void displayInfo() {
        System.out.println("\n== Singer Info ==");
        super.displayInfo();
        System.out.println("Genre: " + genre);
    }
}
