package poo.herencia;

public class Escola {

    public static void main(String[] args){

        Persona p1 = new Persona("Paco", 26, 82.15f, 'A');
        p1.print();

        Alumne a = new Alumne("Toni", 45, 81.3f, 'O', 1, 'F');
        a.print();
    }

}
