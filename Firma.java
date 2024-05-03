import java.util.ArrayList;

public class Firma {
    private String name;
    private String adresse;
    private ArrayList<Raum> raumListe;
    

    public Firma(String name, String adresse) {
        this.name = name;
        this.adresse = adresse;
        this.raumListe = new ArrayList<>();
    }

     public void fuegeRaumHinzu(int plaetze) {
        Raum neuerRaum = new Raum(plaetze);
        raumListe.add(neuerRaum);
    }

      public int sucheRaum(int plaetze) {
        for (int i = 0; i < raumListe.size(); i++) {
            Raum raum = raumListe.get(i);
            if (!raum.istGebucht() && raum.getPlaetze() >= plaetze) {
                return i + 1; // Raumnummerierung beginnt bei 1
            }
        }
        return -1;
    }

      public int anzahlFrei() {
        int frei = 0;
        for (Raum raum : raumListe) {
            if (!raum.istGebucht()) {
                frei++;
            }
        }
        return frei;
    }











