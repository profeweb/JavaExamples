package poo.composicio;

public class ProvaPoligons {

    public static void main(String[] args) {

        // Creació de l'objecte de classe Triangle
        Triangle t1 = new Triangle(new Punt3D(100, 100, 0), new Punt3D(300, 120, 0), new Punt3D(200, 300, 0));

        // Modificar un dels punts del triangle
        t1.setVertexAt(0, new Punt3D(50, 50, 0));

        // Imprimir la informació del triangle
        t1.imprimir();
    }
}
