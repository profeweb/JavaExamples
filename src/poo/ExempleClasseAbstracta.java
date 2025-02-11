package poo;

import access.a.A;

public class ExempleClasseAbstracta {

    public static void main(String[] args) {
        // Persona p = new Persona("Paco", 33);
        // No es pot instanciar una classe abstracte

        Alumne a = new Alumne("Pep", 23, 4);
    }

    public static abstract class Persona {
        String nom;
        int edat;

        public Persona(String nom, int edat){
            this.nom = nom; this.edat = edat;
        }

    }

    public static class Alumne extends Persona {
        int curs;
        public Alumne(String n, int e, int c){
            super(n, e);
            this.curs = c;
        }
    }
}
