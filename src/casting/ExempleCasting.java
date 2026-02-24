package casting;

public class ExempleCasting {

    public static void main(String[] args) {
        Persona persona = new Persona("Paco");
        Alumne alumne = new Alumne("Bel", 4);
        Professor profe = new Professor("Pep", "Mates");

        // No serà possible copiar objectes entre subclasses
        // alumne = profe;
        // profe = alumne;

        // Copiar desde subclasse a superclasse
        persona = alumne;
        // Casting ascendent ( convertir un objecte de la subclasse en objecte de la superclasse)
        persona = (Persona) alumne;
        System.out.println(persona.nom); // Només puc accedir a propietats de superclasse

        // Casting descendent
        Alumne alumne2 = (Alumne) persona;
        System.out.println(alumne2.curs);

        // Intent de casting impossible (ERROR)
        Professor profe2 = (Professor) persona;
        System.out.println(profe2.departament);
    }

    static class Persona {
        String nom;
        Persona(String nom){ this.nom = nom; }
    }
    static class Alumne extends Persona{
        int curs;
        Alumne(String nom, int curs){ super(nom); this.curs = curs; }
    }
    static class Professor extends Persona{
        String departament;
        Professor(String nom, String dep){ super(nom); this.departament = dep; }
    }
}
