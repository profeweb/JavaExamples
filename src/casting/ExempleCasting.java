package casting;

public class ExempleCasting {

    public static void main(String[] args) {

        // CASTING DE TIPUS BÀSICS (només possible entre números -float, int, double, char-).
        int x = 6;
        float y = 6.75f;

        x = (int) y;    // Casting explicit de tipus (perd informació -decimals suprimits-).
        y = x;          // Casting implicit de tipus (no perd informació -decimals afegits-).

        // CASTING D'OBJETES DE CLASSE (només possible entre subclasses i superclasses).

        Persona persona = new Persona("Paco");     // objecte de la superclasse Persona
        Alumne alumne = new Alumne("Bel", 4);   // objecte de la subclasse Alumne
        Professor profe = new Professor("Pep", "Mates");    // objecte de la subclasse Professor

        // No serà possible copiar objectes entre subclasses (ERROR).
        // alumne = profe;
        // profe = alumne;

        // Casting ascendent ( convertir un objecte de la subclasse en objecte de la superclasse).
        persona = alumne;
        System.out.println(persona.nom); // Només puc accedir a propietats de la superclasse

        // Casting descendent (de Superclasse a Subclasse).
        Alumne alumne2 = (Alumne) persona;
        System.out.println(alumne2.curs);

        // Intent de casting no possible (ERROR perquè persona no conté un Professor sinó un Alumne).
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
