package basics;

public class OperacionsMath {

    public static void main(String[] args) {

        // Potencia (2 elevat a 4, base=2, exponent = 4)
        double x = Math.pow(2, 4);
        System.out.println("2 elevat a 4: " + x);

        // Arrel quadrada
        double a = Math.sqrt(16);
        System.out.println("Arrel quadrada de 16: " + a);

        // Constant PI
        double radi = 100;
        double ac = Math.PI * Math.pow(radi, 2);
        System.out.println("Àrea de cercle de radi 100: " + ac);

        // Arrodonir número
        int nota = (int)Math.round(4.7);
        System.out.println("Nota arrodonida: " + nota);

        // Número aleatori entre 10 i 50
        int nr = (int)(10 + Math.random()*40);
        System.out.println("Número Aleatori: " + nr);


    }
}
