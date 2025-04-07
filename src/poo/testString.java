package poo;

public class testString {

    public static void main(String[] args) {

        // Objecte (Classe)
        String original = "Hola";
        original = metode(original);
        System.out.print(original);

        // Tipus bàsic
        int x = 10;
        metode(x);
        System.out.print(x);
        
    }

    static String metode(String o){
        return o.toUpperCase();
    }

    static void metode(int x){
        x = x + 1;
    }


}
