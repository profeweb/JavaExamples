package basics;

import java.util.Scanner;

class CalculaMovimentRectilini {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // INPUT Posició inicial S0(X0, Y0)
        System.out.print("Enter X0: ");
        float x0 = input.nextFloat();
        System.out.print("Enter Y0: ");
        float y0 = input.nextFloat();

        // INPUT VELOCITAT
        System.out.print("Enter  VX: ");
        float vx = input.nextFloat();
        System.out.print("Enter VY: ");
        float vy = input.nextFloat();

        // INPUT TEMPS
        System.out.print("Enter  T: ");
        float t = input.nextFloat();

        // S = S0 + V*t
        float x = x0 + vx*t;
        float y = y0 + vy*t;

        // OUTPUT NOVA POSICIÓ
        System.out.println("S = ["+x+", "+y+"]");
    }
}