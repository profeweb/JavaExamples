package poo.composicio;

public class ProvaPunt2D {

    public static void main(String[] args) {
        Punt2D p1, p2;

        p1 = new Punt2D("B", 5, 3);
        p2 = new Punt2D(15, 30);

        p1.setXY(6, 4);

        p1.imprimir();
        p2.imprimir();
    }
}
