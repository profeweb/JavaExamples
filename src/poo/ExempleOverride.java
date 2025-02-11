package poo;

import access.a.A;

public class ExempleOverride {
    public static void main(String[] args) {
        Persona[] persones = new Persona[3];
        persones[0] = new Alumne("Pep");
        persones[1] = new Professor("Manel");
        persones[2] = new Alumne("Bel");

        // Opció fàcil gràcies a Override
        for(int i=0; i<persones.length; i++){
            persones[i].imprimir();
        }

        // Opció difícil sense Override
        for(int i=0; i<persones.length; i++){
            if(persones[i] instanceof Alumne){
                ((Alumne)persones[i]).imprimir2();
            }
            else if(persones[i] instanceof Professor){
                ((Professor)persones[i]).imprimir2();
            }

        }
    }

    public static class Persona {
        String nom;
        public Persona(String n){ this.nom = n; }
        public void imprimir(){}
    }

    public static class Alumne extends Persona{
        public Alumne(String n){ super(n); }
        public void imprimir(){ System.out.println(nom.toUpperCase());}
        public void imprimir2(){ System.out.println(nom.toUpperCase());}

    }

    public static class Professor extends Persona{
        public Professor(String n){ super(n); }
        public void imprimir(){ System.out.println(nom.toLowerCase());}
        public void imprimir2(){ System.out.println(nom.toLowerCase());}
    }

}
