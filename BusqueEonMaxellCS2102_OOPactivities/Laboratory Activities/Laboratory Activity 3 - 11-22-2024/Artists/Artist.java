public class Artist {

    private String name;
    private String nationality;
    private int age;
    private String specialty;

    Artist (String name, String nationality, int age, String specialty) {
        this.name = name;
        this.nationality = nationality;
        this.age = age;
        this.specialty = specialty;
    }

    //getter methods

    public String getName() {
        return name;
    }

    public String getNationality() {
        return nationality;
    }

    public int getAge() {
        return age;
    }

    public String getSpecialty() {
        return specialty;
    }

    //setter methods

    public void setName(String name) {
        this.name = name;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    //displays the info for Artist
    public void displayInfo() {
        System.out.println("Artist Name: " + name);
        System.out.println("Nationality: " + nationality);
        System.out.println("Age: " + age);
        System.out.println("Specialty: " + specialty);
    }
}
