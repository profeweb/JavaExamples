package condicionals;

import java.util.Scanner;

public class Notes {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter mark:");

        int nota = input.nextInt();

        if(nota>=0 && nota<5){
            System.out.println("FAIL");
        }
        else if(nota>=5 && nota<7) {
            System.out.println("GOOD");
        }
        else if(nota>=7 && nota<9) {
            System.out.println("VERY GOOD");
        }
        else if(nota>=9 && nota<=10) {
            System.out.println("EXCEL·LENT");
        }
        else {
            System.out.println("INVALID MARK");
        }

    }
}
