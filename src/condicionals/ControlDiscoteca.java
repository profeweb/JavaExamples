package condicionals;

import java.util.Scanner;

public class ControlDiscoteca {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age:");
        int age = input.nextInt();

        if(age<18){
            System.out.println("Sorry, you can\'t enter!");
        }
        else {
            System.out.println("Welcome to the Disco!!");
        }

    }
}
