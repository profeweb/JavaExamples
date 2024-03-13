package poo.exempleClasse;

public class Professor {

    enum ASSIGNATURA {MATES, FISICA, ANGLES};

    String nom;
    int edat;
    ASSIGNATURA assignatura;

    public Professor(String nom, int edat, ASSIGNATURA assignatura) {
        this.nom = nom;
        this.edat = edat;
        this.assignatura = assignatura;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public ASSIGNATURA getAssignatura() {
        return assignatura;
    }

    public void setAssignatura(ASSIGNATURA assignatura) {
        this.assignatura = assignatura;
    }

    public void imprimir(){
        System.out.printf("%s de %s %d anys.%n", nom, assignatura, edat);
    }

    boolean esMesVell(Professor altre){
        return this.edat > altre.edat;
    }

    String getNomMesVell(Professor altre){
        return esMesVell(altre) ? this.nom : altre.nom;
    }

    String getNomMesCurt(Professor altre){
        return (this.nom.length()>altre.nom.length()) ? altre.nom : this.nom;
    }
}
