package condicionals;

import java.util.Scanner;

public class ArrelsQuadratiques {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter A:");
        int a = input.nextInt();

        System.out.print("Enter B:");
        int b = input.nextInt();

        System.out.print("Enter C:");
        int c = input.nextInt();

        double d = Math.pow(b, 2) - 4*a*c;

        if(d>0){
            double x1 = (-b + Math.sqrt(d)) / (2*a);
            double x2 = (-b - Math.sqrt(d)) / (2*a);
            System.out.println("Les 2 solucions són: "+x1 + " i "+x2);
        }
        else if(d==0){
            double x = -b / (2*a);
            System.out.println("La solució és: "+x);
        }
        else {
            System.out.println("No hi ha solucions!");
        }


    }
}
