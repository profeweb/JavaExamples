package bucles;

import java.util.Scanner;

public class DemanaBreak {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        while(true){
            System.out.print("Número: ");
            int n = input.nextInt();

            if(n==0){
                break;
            }
        }
    }
}
