package conversions;
import java.util.Scanner;

public class Binari2Decimal {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Binary number: ");
        int nb2 = input.nextInt();
        int nb = nb2;
        int nd = 0;
        int pot = 1;

        while(nb!=0){
            int r = nb % 10;
            nb = nb / 10;
            nd = r*pot + nd;
            pot = 2* pot;
        }
        System.out.printf("Binary number %d is decimal number %d.", nb2, nd);
    }
}
