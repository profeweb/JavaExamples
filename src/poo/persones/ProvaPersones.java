package poo.persones;

public class ProvaPersones {

    public static void main(String[] args) {

        Persona p = new Persona("Paco", 34, Persona.SEXE.HOME);
        Alumne a1 = new Alumne("Jose", 16, Persona.SEXE.HOME, 1, 'A');
        Alumne a2 = new Alumne("Bel", 15, Persona.SEXE.DONA, 2, 'C');

        p = a1;

        p.imprimir();

        a1.setNom("Josete");  // Ús de mètode heretat (extends)

        a1.imprimir();  // Ús de mètode sobre-escrit (override)
        a2.imprimir();


    }
}
