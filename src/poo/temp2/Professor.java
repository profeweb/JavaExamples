package poo.temp2;

public class Professor {

    // Propietats / atributs
    String nom;
    int edat;
    String departament;

    // Constructor
    Professor(String n, int edat, String dep){
        this.nom = n;
        this.edat = edat;
        this.departament = dep;
    }

    // Getters
    public String getNom() { return  this.nom; }
    public int getEdat() { return  this.edat; }
    public String getDepartament() { return  this.departament; }

    // Setters
    public void setNom(String nom){ this.nom = nom; }
    public void setEdat(int edat){ this.edat = edat; }
    public void setDepartament(String dep){ this.departament = dep; }

    // Altres
    public void print(){
        System.out.printf("%s de %s té %d anys.\n", nom, departament, edat);
    }

}
