package funcions;
import java.util.Scanner;

public class PotenciaFuncio {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Base:");
        int base = input.nextInt();

        System.out.print("Exponent:");
        int exponent = input.nextInt();

        int x = potencia(base, exponent);
        System.out.printf("%d elevat a %d és %d.", base, exponent, x);
    }

    public static int potencia(int b, int e){
        int i=1;
        int p = 1;
        while(i<=e){
            p = p*b;
            i++;
        }
        return p;
    }
}
