package bucles;

public class EndivinaNumero {

    public static void main(String[] args){

        int n = 1 + (int) (Math.random()*100);

        int top = 100;
        int bot = 1;
        int middle;

        do {

            middle = (bot + top) / 2;

            if(n<middle){
                System.out.println("El número és menor que "+middle);
                top = middle;
            }
            else if(n>middle){
                System.out.println("El número és major que "+middle);
                bot = middle;
            }
            else {
                System.out.println("El número és "+middle);
            }

        } while(n!=middle);

    }
}
