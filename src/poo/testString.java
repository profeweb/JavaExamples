package poo;

public class testString {

    public static void main(String[] args) {

        // Objecte String (Classe)
        String original = "Hola";
        original = metode(original);
        System.out.println(original);

        // Tipus bàsic (int)
        int x = 10;
        metode(x);
        System.out.println(x);

    }

    // Mètode que rep objecte com a paràmetre i el modifica (passa a majúscules)
    // Cal fer un mètode de retorn per a modificar el valor
    static String metode(String o){
        return o.toUpperCase();
    }

    // Mètode que rep tipus bàsic com a paràmetre i el modifica (sumant 1)
    // No cal fer un mètode de retorn per a modificar el valor
    static void metode(int x){
        x = x + 1;
    }


}
