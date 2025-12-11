package poo.colleccionista;

public class Segell {

    private String nom;
    private double preu;
    private int anys;

    public Segell(String nom, double preu, int anys){
        this.nom =nom;
        this.preu = preu;
        this.anys = anys;
    }

    // Getters i Setters

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
