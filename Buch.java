
    public class Buch {

        private String titel;
        private Autor autor;
        private long isbn;
        private double preis;

        public Buch(String titel, Autor autor, long isbn, double preis) {
            this.titel = titel;
            this.autor = autor;
            this.isbn = isbn;
            this.preis = preis;
        }



        public String getTitel() {
            return titel;
        }

        public long getIsbn() {
            return isbn;
        }

        public double getpreis() {
            return preis;
        }

        public void setPreis(double preis) {
            this.preis = preis;
        }


        public String toString() {
            return "[Buch] Titel: " + titel +", "+ autor + " ISBN: " + isbn +","+ " Preis: " + preis + "€";
        }
}





