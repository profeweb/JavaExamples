package condicionals;

import java.util.Scanner;

public class SwitchSuspeses {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Quantes suspeses?");
        int suspeses = input.nextInt();

        switch(suspeses){
            case 0: System.out.println("GENIAL!!!"); break;
            case 1: System.out.println("PER UNA!!!"); break;
            case 2: System.out.println("BUFFF!!!"); break;
            default: System.out.println("ME TENEN MANIA!!!");
        }

    }
}
