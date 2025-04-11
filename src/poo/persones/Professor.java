package poo.persones;

public class Professor extends Persona {

    // Declaració del tipus enumerat
    enum DEPARTAMENT {FÍSICA, CATALÀ, MATES};

    // Propietats, atributs, informació o variables de classe ////////////////////////
    int anys;
    DEPARTAMENT departament;

    // Mètodes de la classe Alumne //////////////////////////////////////////////////

    // Constructor (s)
    Professor(String n, int e, SEXE s, int a, DEPARTAMENT d){
        super(n, e, s);
        anys = a;
        departament = d;
    }

    Professor(String n, int e, SEXE s, DEPARTAMENT d){
        super(n, e, s);
        anys = 0;  // Valor per defecte, en cas de no saber-ho.
        departament = d;
    }

    // Getters (accesores) ////////////////////////////////////////////////////////////

    int getAnys(){
        return anys;
    }

    DEPARTAMENT getDepartament(){
        return departament;
    }

    // Setters (mutadores) ////////////////////////////////////////////////////////////


    void setAnys(int c){
        anys = c;
    }

    void setDepartament(DEPARTAMENT d){
        departament = d;
    }

    // Altres mètodes ////////////////////////////////////////////////////////////////////

    public void imprimir(){
        System.out.printf("%s de %d anys - %s.\n", nom, anys, departament);
    }
}
