package condicionals;

import java.util.Scanner;

public class ControlVelocitat {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter speed:");
        int speed = input.nextInt();

        if(speed<=90){
            System.out.println("Velocitat correcte.");
        }

    }
}
