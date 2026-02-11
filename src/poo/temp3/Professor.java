package poo.temp3;

public class Professor extends Persona {

    enum DEPARTAMENT { FISICA, CATALA, ANGLES };

    //Atributs
    int anysDocent;
    DEPARTAMENT departament;

    // Constructor
    public Professor(String nom, int edat, SEXE sexe, int anysDocent, DEPARTAMENT dep){
        super(nom, edat, sexe);
        this.anysDocent = anysDocent;
        this.departament = dep;
    }

    // Getters i Setters

    public int getAnysDocent() {
        return anysDocent;
    }

    public void setAnysDocent(int anysDocent) {
        this.anysDocent = anysDocent;
    }

    public DEPARTAMENT getDepartament() {
        return departament;
    }

    public void setDepartament(DEPARTAMENT departament) {
        this.departament = departament;
    }

    //Altres
    public void print(){
        String titol = (sexe == SEXE.DONA) ? "Professora" : "Professor";
        System.out.printf("%s %s de %s té %d anys de docencia.\n", titol, nom, departament, anysDocent);
    }
}
