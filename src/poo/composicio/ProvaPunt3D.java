package poo.composicio;

public class ProvaPunt3D {

    public static void main(String[] args) {

        // Declaració de les variables de classe Punt3D
        Punt3D p1, p2;

        // Instanciació dels objectes amb els constructors
        p1 = new Punt3D("B", 5, 3, 4);
        p2 = new Punt3D(15, 30, 0);

        // Setter
        p1.setXYZ(6, 4, 10);

        // Altres mètodes

        p1.imprimir();
        p2.imprimir();

        System.out.printf("Distancia entre els punts: %f.\n", p1.distancia(p2));
    }
}
