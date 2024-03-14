package poo.composicio;

public class ProvaLinia {

    public static void main(String[] args) {

        Punt3D a = new Punt3D("A", 100, 50, 50);
        Punt3D b = new Punt3D("B", 150, 100, 30);
        Punt3D c = new Punt3D("C", 200, 70, 10);

        Linia l1 = new Linia(a, b);
        Linia l2 = new Linia(b, c);

        b.setY(200);

        l1.imprimir();
        l2.imprimir();
    }
}
