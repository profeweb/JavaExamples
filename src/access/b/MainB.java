package access.b;

import access.a.A;

public class MainB {

    public static void main(String[] args) {

        // Cridada al constructor (mètode públic) fora del paquest:
        A a = new A(22, "Pepe", 'F');

        // Accés a propietats (pública, protegida i privada):

        System.out.println(a.edat);  // accés públic

        // Error! Accés protected no accessible fora del package de la classe.
        //System.out.println(a.grup);  // accés protegit

        // Error! Accés privat no accessible fora de la pròpia classe.
        //System.out.println(a.nom);

        // Accés a  mètodes (públic, protegit i privat):

        a.print1();  // cridada a mètode públic (void)
        System.out.println(a.getNom()) ; // cridada a mètode públic (getter)

        // Error! Cridada a mètode protegit no accessible fora del package la classe.
        //a.print2();  // cridada a mètode protected

        // Error! Cridada a mètode privat no accessible fora de la pròpia classe.
        //a.print3();



    }
}
