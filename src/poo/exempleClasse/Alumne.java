package poo.exempleClasse;

public class Alumne {

    // Atributs de classe
    String nom;
    int curs;
    char grup;

    // Constructor(s)
    Alumne(String n, int curs, char grup){
        this.nom = n;
        this.curs = curs;
        this.grup = grup;
    }

    Alumne(String n){
        this.nom = n;
        this.curs = 1;
        this.grup = 'A';
    }

    // Setters
    void setNom(String n){
        this.nom = n;
    }

    void setCursGrup(int c, char g){
        this.curs = c;
        this.grup = g;
    }

    // Getters
    String getNom(){
        return this.nom;
    }

    int getCurs(){
        return this.curs;
    }

    char getGrup(){
        return this.grup;
    }

    String getCursGrup(){
        return this.curs+"-"+this.grup;
    }

    // Altres
    void imprimir(){
        System.out.printf("%s , %d - %c.", nom, curs, grup);
    }

}
