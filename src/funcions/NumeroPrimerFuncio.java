package funcions;

import java.util.Scanner;

public class NumeroPrimerFuncio {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        // INPUT N
        System.out.print("N: ");
        int n = input.nextInt();

        if(esPrimer(n)){
            System.out.println("El número "+n+" SÍ és primer.");
        }
        else {
            System.out.println("El número "+n+" NO és primer.");
        }

    }

    public static boolean esPrimer(int n){
        int d = n -1;

        while(d>1){
            System.out.println("Comprovat "+d);
            if(n%d==0){
                break;
            }
            d--;
        }
        if(d==1){
            return false;
        }
        else {
            return true;
        }
    }
}
