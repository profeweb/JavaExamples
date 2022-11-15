package bucles;

import java.util.Scanner;

public class PotenciesDe2 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        // INPUT N
        System.out.print("N: ");
        int n = input.nextInt();

        int pot = 1;
        for(int i=1; i<=n; i++){
            pot *=2;
            System.out.println("Potència "+i+"-èssima de 2 és: "+pot);
        }
    }
}
