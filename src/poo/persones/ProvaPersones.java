package poo.persones;

public class ProvaPersones {

    public static void main(String[] args) {

        // Instanciació de Persona
        Persona p = new Persona("Paco", 34, Persona.SEXE.HOME);

        // Instanciació d'Alumnes
        Alumne a1 = new Alumne("Jose", 16, Persona.SEXE.HOME, 1, 'A');
        Alumne a2 = new Alumne("Bel", 15, Persona.SEXE.DONA, 2, 'C');

        // Instanciació de Professors
        Professor p1 = new Professor("Manel", 45, Persona.SEXE.HOME, 12, Professor.DEPARTAMENT.FÍSICA);
        Professor p2 = new Professor("Xesca", 39, Persona.SEXE.DONA, 15, Professor.DEPARTAMENT.CATALÀ);

        // Imprimeix la informació dels alumnes
        a1.imprimir();  // Ús de mètode sobre-escrit (override)
        a2.imprimir();

        // Imprimieix la informació dels professors
        p1.imprimir();  // Ús de mètode sobre-escrit (override)
        p2.imprimir();

    }
}
