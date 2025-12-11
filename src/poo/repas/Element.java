package poo.repas;

public class Element {

    private String nom;
    private String pais;


    // Constructor

    public Element(String nom, String pais) {
        this.nom = nom;
        this.pais = pais;
    }

    // Setters i Getters


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
