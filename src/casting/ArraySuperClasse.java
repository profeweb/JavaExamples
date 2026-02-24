package casting;

public class ArraySuperClasse {


    static class Persona {
        String nom;
        Persona(String nom){ this.nom = nom; }
        void print(){ System.out.print("Persona: "+ this.nom); }
    }
    static class Alumne extends ExempleCasting.Persona {
        int curs;
        Alumne(String nom, int curs){ super(nom); this.curs = curs; }
        void print(){ System.out.print("Alumne: "+ this.nom+", "+this.curs); }
    }
    static class Professor extends ExempleCasting.Persona {
        String departament;
        Professor(String nom, String dep){ super(nom); this.departament = dep; }
        void print(){ System.out.print("Profe: "+ this.nom+", "+this.departament); }
    }
}
