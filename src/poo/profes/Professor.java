package poo.profes;

public class Professor {

    // Declaració del tipus enumerat
    enum DEPARTAMENT {FÍSICA, CATALÀ, MATES};

    // Propietats, atributs, informació o variables de classe ////////////////////////
    String nom;
    int anys;
    DEPARTAMENT departament;

    // Mètodes de la classe Alumne //////////////////////////////////////////////////

    // Constructor (s)
    Professor(String n, int c, DEPARTAMENT d){
        nom = n;
        anys = c;
        departament = d;
    }

    Professor(String n, DEPARTAMENT d){
        nom = n;
        anys = 0;  // Valor per defecte, en cas de no saber-ho.
        departament = d;
    }

    // Getters (accesores) ////////////////////////////////////////////////////////////

    String getNom(){
        return nom;
    }

    int getAnys(){
        return anys;
    }

    DEPARTAMENT getDepartament(){
        return departament;
    }

    // Setters (mutadores) ////////////////////////////////////////////////////////////

    void setNom(String n){
        nom = n;
    }

    void setAnys(int c){
        anys = c;
    }

    void setDepartament(DEPARTAMENT d){
        departament = d;
    }

    // Altres mètodes ////////////////////////////////////////////////////////////////////

    void print(){
        System.out.printf("%s de %d - %s.\n", nom, anys, departament);
    }
}
