package poo.temp2;

public class Alumne {

    // 1) Atributs o propietats (variables)
    String nom;
    int curs;
    char grup;

    // 2) Mètode(s) constructor(s)
    Alumne(String nom, int curs, char grup){
        this.nom = nom;
        this.curs = curs;
        this.grup = grup;
    }

    Alumne(String nom){
        this.nom = nom;
        this.curs = 1;
        this.grup = 'A';
    }

    // 3) Mètodes Getters (accesores)
    public String getNom(){  return this.nom; }
    public int getCurs(){ return this.curs; }
    public char getGrup(){ return this.grup;}

    // 4) Mètodes Setters (mutadores)
    public void setNom(String nom){ this.nom = nom; }
    public void setCurs(int curs){ this.curs = curs; }
    public void setGrup(char grup){ this.grup = grup; }

    // 5) Altres mètodes
    public void print(){
        System.out.printf("%s va a %d - %c.\n", nom, curs, grup);
    }


}
