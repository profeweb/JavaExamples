package bucles;

import java.util.Scanner;

public class MitjanaNumeros {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        float suma = 0f;
        int num = 0;

        do {
            System.out.print("Número: ");
            int n = input.nextInt();
            if(n==0){
                break;
            }
            suma += n;
            num++;
        }while(true);

        System.out.println("MITJANA: "+suma/num);

    }
}
