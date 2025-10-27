package bucles;

public class AdivinaNumero {

    public static void main(String[] args) {

        int n = 1 + (int)(100*Math.random());
        System.out.printf("Número imaginat: %d. %n", n);

        int bot = 1;
        int top = 100;
        int middle = (top + bot) / 2;
        while(middle!=n){
            if(middle<n){
                bot = middle;
                middle = (top + bot) / 2;
            }
            else if(middle>n){
                top = middle;
                middle = (top + bot) / 2;
            }
        }
        System.out.printf("El número trobat és %d. ", middle);
    }
}
