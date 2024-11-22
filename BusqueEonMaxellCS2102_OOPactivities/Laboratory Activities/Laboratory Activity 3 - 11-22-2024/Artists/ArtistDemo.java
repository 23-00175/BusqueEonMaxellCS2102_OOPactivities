public class ArtistDemo {

    public static void main(String[] args) {

        // instance of an artist 
        Artist artist = new Artist("Charlie Puth", "American", 32, "Music");
        artist.displayInfo();

        System.out.println();

        // instance of a singer 
        Singer singer = new Singer("Nayeon Im", "Korean", 29, "Music", Singer.Type.POP);
        singer.displayInfo();

        System.out.println();

        // instance of a painter 
        Painter painter = new Painter("Godwin Miles", "Filipino", 45, "Art", Painter.Type.CHARCOAL);
        painter.displayInfo();

        System.out.println();

        // instance of a writer
        Writer writer = new Writer("Genesis Jim", "Filipino", 65, "Writing", Writer.Type.DRAMA);
        writer.displayInfo();

        System.out.println();

        // instance of a dancer
        Dancer dancer = new Dancer("Hubert Ross", "Filipino", 69, "Dancing", Dancer.Type.HIPHOP);
        dancer.displayInfo();

        System.out.println();
    }
}
