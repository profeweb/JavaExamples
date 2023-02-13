package conversions;
import java.util.Scanner;

public class Decimal2hexadecimalArray {

    public static void main(String[] args){

        char[] hexaSimbols = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Decimal number: ");
        int nd2 = input.nextInt();
        int nd = nd2;
        String nh = "";

        while(nd!=0){
            int r = nd % 16;
            nd = nd / 16;
            nh = hexaSimbols[r] + nh;
        }
        System.out.printf("Decimal number %d is hexadecimal number %s.", nd2, nh);
    }
}
