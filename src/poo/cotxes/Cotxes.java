package poo.cotxes;

public class Cotxes {

    public static void main(String[] args){

        // Construcció de cotxes
        Cotxe c1 = new Cotxe("123456CL", "Ford");
        Cotxe c2 = new Cotxe("987654XS", "Seat", 50, 5);

        // Obtenció d'informació amb getter
        float v1 = c1.getVelocitat();
        System.out.printf("Velocitat del cotxe 1: %f Km/h.\n ",v1);

        // Actualització amb setter
        c1.setNumPortes(3);

        // Altres mètodes
        c1.accelerar();
        c1.accelerar();
        c1.accelerar();

        c2.accelerar(2.5f);

        c1.print();
        c2.print();

    }
}
