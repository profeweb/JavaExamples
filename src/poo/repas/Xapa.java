package poo.repas;

public class Xapa {

    private String nom;
    private double preu;
    private int antic;

    public Xapa(String nom, double preu, int antic){
        this.nom =nom;
        this.preu = preu;
        this.antic = antic;
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

    public int getAntic() {
        return antic;
    }

    public void setAntic(int antic) {
        this.antic = antic;
    }
}
