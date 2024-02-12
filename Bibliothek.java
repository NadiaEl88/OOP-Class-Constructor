import java.util.ArrayList;
import java.util.List;



public class Bibliothek {
    private List<Buch> buchListe;

    public Bibliothek() {
        buchListe = new ArrayList<>();
    }

    public void buchHinzufuegen(Buch buch) {
        buchListe.add(buch);
        System.out.println("Buch hinzugefügt: " + buch);
    }

    public void buchAusleihen(Buch buch) {
        if (buchListe.contains(buch)) {
            buchListe.remove(buch);
            System.out.println("Buch ausgeliehen: " + buch);
        } else {
            System.out.println("Das Buch ist nicht in der Bibliothek vorhanden.");
        }
    }

    public void buchZurueckgeben(Buch buch) {
        buchListe.add(buch);
        System.out.println("Buch zurückgegeben: " + buch);
    }

    public void buchLoeschen(Buch buch) {
        buchListe.remove(buch);
        System.out.println("Buch gelöscht: " + buch);
    }
}
