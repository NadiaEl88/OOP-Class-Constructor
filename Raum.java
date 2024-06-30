class Raum {
    private int plaetze;
    private boolean gebucht;

    public Raum(int plaetze) {
        this.plaetze = plaetze;
        this.gebucht = false;
    }

    public int getPlaetze() {
        return plaetze;
    }

    public boolean istGebucht() {
        return gebucht;
    }

    public void bucheRaum() {
        gebucht = true;
    }

    public void entbucheRaum() {
        gebucht = false;
    }
}
