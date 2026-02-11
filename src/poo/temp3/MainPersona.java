package poo.temp3;

public class MainPersona {

    public static void main(String[] args) {

        Persona p = new Persona("Paco", 33, Persona.SEXE.HOME);
        p.print();

        Professor prof = new Professor("Bel", 36, Persona.SEXE.DONA,
                                        10, Professor.DEPARTAMENT.CATALA);
        prof.print();

        Alumne a = new Alumne("Pep", 15, Persona.SEXE.HOME, 4, 'a');
        a.printOverride(true);
        a.printOverride(false);

    }
}
