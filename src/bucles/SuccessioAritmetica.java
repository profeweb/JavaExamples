package bucles;

import java.util.Scanner;

public class SuccessioAritmetica {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        // INPUT N
        System.out.print("N: ");
        int n = input.nextInt();

        for(int i=1; i<=n; i++){
            int x = 2*i - 1;
            System.out.printf("L\' %d-èssim valor de la successió és %d.\n",i, x);
        }
    }
}
