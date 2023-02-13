package conversions;
import java.util.Scanner;

public class Decimal2binari {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Decimal number: ");
        int nd2 = input.nextInt();
        int nd = nd2;
        int nb = 0;
        int pot = 1;

        while(nd!=0){
            int r = nd % 2;
            nd = nd / 2;
            nb = r*pot + nb;
            pot = 10* pot;
        }
        System.out.printf("Decimal number %d is binary number %d.", nd2, nb);
    }
}
