package condicionals;

import java.util.Scanner;

public class ControlVelocitat3 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter speed:");
        int speed = input.nextInt();

        String s = (speed<=90) ? "Correcte" : "Incorrecte";
        System.out.println(s);

    }
}
