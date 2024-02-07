package conversions;
import java.util.Scanner;

public class Binari2DecimalFuncio {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Binary number: ");
        int nb = input.nextInt();
        int nd = binari2decimal(nb);

        System.out.printf("Binary number %d is decimal number %d.", nb, nd);
    }

    public static int binari2decimal(int nb){
        int nd = 0;
        int pot = 1;

        while(nb!=0){
            int r = nb % 10;
            nb = nb / 10;
            nd = r*pot + nd;
            pot = 2 * pot;
        }
        return nd;
    }
}
