package poo.repas;

public class Xapa {

    private String nom;
    private double preu;
    private int anys;

    public Xapa(String nom, double preu, int antic){
        this.nom =nom;
        this.preu = preu;
        this.anys = antic;
    }

    // Setters i Getters


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPreu() {
        return preu;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }

    public int getAnys() {
        return anys;
    }

    public void setAnys(int anys) {
        this.anys = anys;
    }
}
