package poo.composicio;

public class ProvaPunt2D {

    public static void main(String[] args) {

        // Declaració de les variables de classe Punt2D
        Punt2D p1, p2;

        // Instanciació dels objectes amb els constructors
        p1 = new Punt2D("B", 5, 3);
        p2 = new Punt2D(15, 30);

        // Setter
        p1.setXY(6, 4);

        // Altres mètodes
        p1.imprimir();
        p2.imprimir();

        System.out.printf("Distancia entre els punts: %f.\n", p1.distancia(p2));
    }
}
