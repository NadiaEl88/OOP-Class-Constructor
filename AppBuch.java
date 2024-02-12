import java.util.Scanner;

public class AppBuch {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in); 
                
            Autor autor1 = new Autor("Arthur Conan Doyle");
            autor1.setSynonym("ACD");
            autor1.setGage(500);

            Autor autor2 = new Autor("Michelle Cohen Corasanti");
            autor2.setSynonym("MCC");
            autor2.setGage(1000);

            Autor autor3 = new Autor("Sue Watson");
            autor3.setSynonym("SW");
            autor3.setGage(750);


            Buch buch1 = new Buch("Der schwarze Peter",autor1, 9783841209566L, 0.99);
            Buch buch2 = new Buch("Der Junge, der vom Frieden träumte", autor2, 9783104033921L, 12);
            Buch buch3 = new Buch("Der Urlaub", autor3, 101837903719L, 10.99);

            System.out.println(buch1);
            System.out.println(buch2);
            System.out.println(buch3);

        System.out.println("Willkommen zum Buchverwaltungsprogramm!");

        // Eingaben von der Konsole lesen
        System.out.print("Titel eingeben: ");
        String titel = scanner.nextLine();

        System.out.print("Autor eingeben: ");
        String autor = scanner.nextLine();

        System.out.print("ISBN eingeben: ");
        long isbn = scanner.nextLong();

        System.out.print("Preis eingeben: ");
        double preis = scanner.nextDouble();

        // Ein Buch erstellen
        Buch buch = new Buch(titel, new Autor(autor), 0, 0);
        System.out.println("Buch erstellt: " + buch);
        scanner.close();

    }
}

