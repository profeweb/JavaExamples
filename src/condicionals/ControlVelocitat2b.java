package condicionals;

import java.util.Scanner;

public class ControlVelocitat2b {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter speed:");
        int speed = input.nextInt();

        if(speed<=50){
            System.out.println("Velocitat massa baixa.");
        }
        else if(speed<=90){
            System.out.println("Velocitat correcte.");
        }
        else if(speed<=120){
            System.out.println("Controlo la Velocitat.");
        }
        else {
            System.out.println("Velocitat incorrecte");
        }

    }
}
