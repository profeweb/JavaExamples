package condicionals;

import java.util.Scanner;

public class PreuEntrades {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of tickets:");
        int num = input.nextInt();

        int preu;

        if(num>0 && num<5){
            preu = 5;
        }
        else if(num<10){
            preu = 4;
        }
        else {
            preu = 3;
        }

        int total = num* preu;
        System.out.println("Total price: "+total);

    }
}
