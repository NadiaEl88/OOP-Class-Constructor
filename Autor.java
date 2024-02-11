public class Autor {

    private String name;
    private String synonym;
    private int gage;

    public Autor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getsynonym() {
        return this.synonym;
    }

    public void setSynonym(String synonym) {
        this.synonym = synonym;
    }

    public int getGage() {
        return gage;
    }

    public void setGage(int gage) {
        this.gage = gage;
    }

    public String toString (){
        return "Autor: " + name + ", Synonym: " + synonym + ", Gage: "+ gage+",";
    }
}


