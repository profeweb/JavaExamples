package conversions;
import java.util.Scanner;

public class Decimal2hexadecimal {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Decimal number: ");
        int nd2 = input.nextInt();
        int nd = nd2;
        String nh = "";

        while(nd!=0){
            int r = nd % 16;
            nd = nd / 16;
            nh = digitToHexaString(r) + nh;
        }
        System.out.printf("Decimal number %d is hexadecimal number %s.", nd2, nh);
    }

    public static String digitToHexaString(int n){
        if(n<10){
            return String.valueOf(n);
        }
        else if(n==10){
            return "A";
        }
        else if(n==11){
            return "B";
        }
        else if(n==12){
            return "C";
        }
        else if(n==13){
            return "D";
        }
        else if(n==14){
            return "E";
        }
        else {
            return "F";
        }
    }
}
