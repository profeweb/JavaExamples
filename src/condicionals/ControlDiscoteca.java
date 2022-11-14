package condicionals;

import java.util.Scanner;

public class ControlDiscoteca {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age:");
        int speed = input.nextInt();

        if(speed<18){
            System.out.println("Sorry, you ca\'nt enter!");
        }
        else {
            System.out.println("Welcome to the Disco!!");
        }

    }
}
