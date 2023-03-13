package poo.cotxes;

public class Cotxes {

    public static void main(String[] args){

        Cotxe c1 = new Cotxe("123456CL", "Ford");
        Cotxe c2 = new Cotxe("987654XS", "Seat", 50, 5);

        c1.accelerar();
        c1.accelerar();
        c1.accelerar();

        c1.print();
        c2.print();

    }
}
