package conversions;
import java.util.Scanner;

public class Octal2Decimal {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Octal number: ");
        int no2 = input.nextInt();
        int no = no2;
        int nd = 0;
        int pot = 1;

        while(no!=0){
            int r = no % 10;
            no = no / 10;
            nd = r*pot + nd;
            pot = 8* pot;
        }
        System.out.printf("Octal number %d is decimal number %d.", no2, nd);
    }
}
