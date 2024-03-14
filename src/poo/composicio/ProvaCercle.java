package poo.composicio;

public class ProvaCercle {

    public static void main(String[] args) {

        // Creació dels objectes de la classe Cercle
        Cercle c1 = new Cercle(new Punt3D(300, 200, 0), 100);
        Cercle c2 = new Cercle(50);

        // Consultar l'atribut amb el getter
        float r1 = c1.getRadi();
        System.out.println("El radi del cercle C1 és: "+ r1);

        // Modificar l'atribut amb el setter
        c2.setRadi(80);

        // Imprimir els atributs dels cercles
        c1.imprimir();
        c2.imprimir();


    }
}
