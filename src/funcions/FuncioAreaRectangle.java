package funcions;

import java.util.Scanner;

public class FuncioAreaRectangle {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Costat A:");
        float a = input.nextFloat();

        System.out.print("Costat B:");
        float b = input.nextFloat();

        float area = areaRect(a, b);
        float perimetre = perimetreRect(a, b);

        System.out.printf("El rectangle de costats %f i %f, té \n area: %f \n perimetre: %f.",
                            a, b, area, perimetre);
    }

    public static float areaRect(float a, float b){
        return a*b;
    }

    public static float perimetreRect(float a, float b){
        return 2*a + 2*b;
    }

}
