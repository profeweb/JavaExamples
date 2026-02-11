package poo.temp3;

public class Persona {

    // Tipus enumerat (definició)
    enum SEXE { HOME, DONA, ALTRE};

    // Atributs
    String nom;
    int edat;
    SEXE sexe;

    // Constructor
    public Persona(String nom, int edat, SEXE sexe){
        this.nom = nom;
        this.edat = edat;
        this.sexe = sexe;
    }

    // Setters


    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public void setSexe(SEXE sexe) {
        this.sexe = sexe;
    }

    // Getters

    public String getNom() {
        return nom;
    }

    public int getEdat() {
        return edat;
    }

    public SEXE getSexe() {
        return sexe;
    }

    // Altres
    public void print(){
        System.out.printf("%s té %d anys i és %s.\n", nom, edat, sexe);
    }
}
