package bucles;

public class ImprimirImpars1a13 {

    public static void main(String[] args){

        for(int n=1;n<=13;n+=2) {
            System.out.printf("%d%n", n);
        }

        for(int n=1;n<=13;n++) {
            if(n%2==1) {
                System.out.printf("%d%n", n);
            }
        }

    }
}
