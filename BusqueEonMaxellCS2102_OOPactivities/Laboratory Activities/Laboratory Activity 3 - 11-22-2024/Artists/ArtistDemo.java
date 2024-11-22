
public class ArtistDemo {

    public static void main(String[] args) {

        // instance of an artist 
        Artist artist = new Artist("Charlie Puth", "American", 32, "Music");

        // instance of a singer 
        Artist singer = new Singer("Nayeon Im", "Korean", 29, "Music", Singer.Type.POP);

        // instance of a painter 
        Artist painter = new Painter("Godwin Miles", "Filipino", 45, "Art", Painter.Type.CHARCOAL);

        // instance of a writer
        Artist writer = new Writer("Genesis Jim", "Filipino", 65, "Writing", Writer.Type.DRAMA);

        // instance of a dancera
        Artist dancer = new Dancer("Hubert Ross", "Filipino", 69, "Dancing", Dancer.Type.HIPHOP);

        artist.displayInfo();
        singer.displayInfo();
        painter.displayInfo();
        writer.displayInfo();
        dancer.displayInfo();

    }
}
