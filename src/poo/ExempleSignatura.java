package poo;

public class ExempleSignatura {

    public static void main(String[] args) {
        int x = calcul(4, 3, 5);
        int y = calcul(2, 5);
    }

    public static int calcul(int a, int b){ return (a + b); }

    public static int calcul(int a, int b, int d){ return (a + b)*d; }

}
