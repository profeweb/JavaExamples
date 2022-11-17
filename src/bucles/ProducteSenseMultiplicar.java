package bucles;

import java.util.Scanner;

public class ProducteSenseMultiplicar {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        // INPUT A
        System.out.print("A: ");
        int a = input.nextInt();

        // INPUT B
        System.out.print("B: ");
        int b = input.nextInt();

        int num = b;
        int producte = 0;

        while(num>0){
            producte += a;
            num--;
        }
        System.out.print("El producte de "+a +" x "+b+ " és "+producte);
    }
}
