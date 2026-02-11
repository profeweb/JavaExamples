package poo.temp2;

public class Linia2DMal {

    char nom1, nom2;
    float x1, y1, x2, y2;

    Linia2DMal(char n1, float x1, float y1, char n2, float x2, float y2){
        this.nom1 = n1; this.x1 = x1; this.y1 = y1;
        this.nom2 = n2; this.x2 = x2; this.y2 = y2;
    }

    //Setters
    public void setNom1(char n1){ this.nom1 = n1; }

    //Getters
    public char getNom1(){ return this.nom1; }

    // Altres
}
