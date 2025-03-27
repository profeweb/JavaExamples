package poo.alumnes;

public class Alumne {

    // Propietats, atributs, informació o variables de classe /////////////////////////////

    String nom;
    int curs;
    char grup;

    // Mètodes de la classe Alumne //////////////////////////////////////////////////////

    // Constructor(s)
    Alumne(String n, int c, char g){
        nom = n;
        curs = c;
        grup = g;
    }

    Alumne(String n){
        nom = n;
        curs = 1;   // Valor per defecte
        grup = 'A'; // Valor per defecte
    }

    // Getters (accesores) //////////////////////////////////////////////////////////////

    String getNom(){
        return nom;
    }

    int getCurs(){
        return curs;
    }

    char getGrup(){
        return grup;
    }

    // Setters (mutadores) ///////////////////////////////////////////////////////////////

    void setNom(String n){
        nom = n;
    }

    void setCurs(int c){
        curs = c;
    }

    void setGrup(char g){
        grup = g;
    }

    void setCursGrup(int c, char g){
        curs = c;
        grup = g;
    }

    // Altres mètodes //////////////////////////////////////////////////////////////////////

    void print(){
        System.out.printf("%s va a %d - %c.\n", nom, curs, grup);
    }
}
