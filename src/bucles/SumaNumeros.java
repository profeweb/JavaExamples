package bucles;

import java.util.Scanner;

public class SumaNumeros {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int suma = 0;

        do {
            System.out.print("Número: ");
            int n = input.nextInt();
            if(n==0){
                break;
            }
            suma += n;
        }while(true);

        System.out.println("SUMA: "+suma);

    }
}
