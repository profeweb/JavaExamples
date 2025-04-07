package poo.temp;

public class MainPunt2D {
    public static void main(String[] args) {

        // Declaració
        Punt2D p1, p2;

        // Instanciació amb els constructors
        p1 = new Punt2D("X", 100, 200);
        p2 = new Punt2D(50, 100);

        // Setter
        p2.setNom("Y");

        // Altres
        double d = p1.distancia(p2);
        System.out.printf("Distància: %f.\n", d);

        p1.print();
        p2.print();
    }
}
