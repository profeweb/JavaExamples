package poo.composicio;

public class ProvaPunt3D {

    public static void main(String[] args) {
        Punt3D p1, p2;

        p1 = new Punt3D("B", 5, 3, 4);
        p2 = new Punt3D(15, 30, 0);

        p1.setXYZ(6, 4, 10);

        p1.imprimir();
        p2.imprimir();
    }
}
