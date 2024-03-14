package poo.persones;

public class Persona {

    enum SEXE {HOME, DONA, ALTRE};

    String nom;
    int edat;
    SEXE sexe;

    public Persona(String nom, int edat, SEXE sexe) {
        this.nom = nom;
        this.edat = edat;
        this.sexe = sexe;
    }

    public String getNom() {
        return nom;
    }

    public int getEdat() {
        return edat;
    }

    public SEXE getSexe() {
        return sexe;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public void setSexe(SEXE sexe) {
        this.sexe = sexe;
    }

    public void imprimir(){
        System.out.printf("%s té %d anys i és %s.%n", nom, edat, sexe);
    }
}
