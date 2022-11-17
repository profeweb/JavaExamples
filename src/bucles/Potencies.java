package bucles;

import java.util.Scanner;

public class Potencies {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        // INPUT B
        System.out.print("B: ");
        int b = input.nextInt();

        // INPUT N
        System.out.print("N: ");
        int n = input.nextInt();

        int pot = 1;
        for(int i=1; i<=n; i++){
            pot *=b;
            System.out.println("Potència "+i+"-èssima de "+b+" és: "+pot);
        }
    }
}
