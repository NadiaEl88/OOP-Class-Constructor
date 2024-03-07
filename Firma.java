public class Firma {
    public static int mindestraumanzahl = 3;
    private String firma;
    private String adresse;
    private String raum;
    private int plaetze;

    public Firma(String firma, String adresse, String raum, int plaetze) {
        this.firma = firma;
        this.adresse = adresse;
        this.raum = raum;
        this.plaetze = plaetze;
    }


    public void fuegeRaumHinzu(int plaetze) {
        if (plaetze <= 0) {
            System.out.println("keine gültige Anzahl von Plätzen. Raum kann nicht hinzugefügt werden.");
        } else if (plaetze <= 50) {
            this.raum = "Dreamroom";
        } else if (plaetze <= 150) {
            this.raum = "Prestigeroom";
        } else if (plaetze <= 250) {
            this.raum = "Bigroom";
        } else {
            System.out.println("Die Firma hat keinen passenden Raum für " + plaetze + " Personen.");
        }
    }

    public String sucheRaum(int plaetze) {
        if (plaetze <= 0) {
            return "Ungültige Anzahl von Plätzen.";
        } else if (plaetze <= 50) {
            return "Dreamroom";
        } else if (plaetze <= 150) {
            return "Prestigeroom";
        } else if (plaetze <= 250) {
            return "Bigroom";
        } else {
            return "Kein passender Raum gefunden.";
        }
    }
    
    public int anzahlFrei() {
        int freiePlaetze = 0;
        if (this.raum.equals("Dreamroom")) {
            freiePlaetze = 50 - this.plaetze;
        } else if (this.raum.equals("Prestigeroom")) {
            freiePlaetze = 150 - this.plaetze;
        } else if (this.raum.equals("Bigroom")) {
            freiePlaetze = 250 - this.plaetze;
        }
        return freiePlaetze;
    }
}








