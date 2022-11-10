package basics;

import java.util.Scanner;
import java.lang.Math;

class CalculaMovimentRectiliniAccelerat {
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

        // INPUT ACCELERACIÓ
        System.out.print("Enter  AX: ");
        float ax = input.nextFloat();
        System.out.print("Enter AY: ");
        float ay = input.nextFloat();

        // INPUT TEMPS
        System.out.print("Enter  T: ");
        float t = input.nextFloat();

        // S = S0 + V*t  + ½*a*t2
        double x = x0 + vx*t + 0.5f*ax*Math.pow(t, 2);
        double y = y0 + vy*t + 0.5f*ay*Math.pow(t, 2);

        // OUTPUT NOVA POSICIÓ
        System.out.println("S = ["+x+", "+y+"]");

        // V = V0 + a*t;
        vx = vx + ax*t;
        vy = vy + ay*t;

        // OUTPUT NOVA VELOCITAT
        System.out.println("V = ["+vx+", "+vy+"]");
    }
}