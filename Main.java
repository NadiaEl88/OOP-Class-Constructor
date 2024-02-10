public class Main {
    public static void main(String[] args) {
        Firma firma = new Firma("Deluxe Room GmbH", "Huberstr. 47, 30159 Hannover", "", 0 );

        firma.testPlatz(50);
        firma.testPlatz(150);
        firma.testPlatz(250);
        firma.testPlatz(-1);
    }
}


