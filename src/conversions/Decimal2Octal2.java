package conversions;

import java.util.Scanner;

public class Decimal2Octal2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Decimal number: ");
        int nd = input.nextInt();
        int no = 0;
        int pot = 1;

        while(nd!=0){
            int r = nd % 8;
            nd = nd / 8;
            no = no + r*pot;
            pot *=10;
        }

        System.out.println(no);
    }
}
