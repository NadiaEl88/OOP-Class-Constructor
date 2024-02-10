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

    public void testPlatz(int plaetze) {
        if (plaetze <= 0) {
            this.raum = "Nicht verfügbar";
        } else if (plaetze <= 50) {
            this.raum = "Dreamroom";
        } else if (plaetze <= 150) {
            this.raum = "Prestigeroom";
        } else if (plaetze <= 250) {
            this.raum = "Bigroom";
        }
        System.out.println("Die Firma " + firma + " in der " +adresse + " bietet für " + plaetze + " Personen den: " + this.raum);
    }
}






