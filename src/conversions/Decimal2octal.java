package conversions;
import java.util.Scanner;

public class Decimal2octal {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Decimal number: ");
        int nd2 = input.nextInt();
        int nd = nd2;
        int no = 0;
        int pot = 1;

        while(nd!=0){
            int r = nd % 8;
            nd = nd / 8;
            no = r*pot + no;
            pot = 10* pot;
        }
        System.out.printf("Decimal number %d is octal number %d.", nd2, no);
    }
}
