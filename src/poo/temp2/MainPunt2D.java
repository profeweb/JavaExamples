package poo.temp2;

import poo.geometria.Punt;

public class MainPunt2D {

    public static void main(String[] args) {

        Punt2D p1, p2; // Declaració

        // Creació o instanciació amb els constructors
        p1 = new Punt2D('O');
        p2 = new Punt2D('A', 200, 100);

        p1.print();
        p1.setXY(50, 300);
        p1.print();

        p2.setNom('B');
        p2.print();
    }
}
