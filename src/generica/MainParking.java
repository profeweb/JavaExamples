package generica;

public class MainParking {

    public static void main(String[] args) {
        Cotxe c1 = new Cotxe("45782CL", 5);
        Cotxe c2 = new Cotxe("12345HJ", 5);
        Cotxe c3 = new Cotxe("97526AX", 3);

        Parking p = new Parking(5);
        
        p.print();

        p.entrada(c1);
        p.entrada(c2);

        p.print();

        p.sortida(c1);
        p.entrada(c3);

        p.print();
    }
}
