package conversions;

import java.util.Scanner;

public class TempConversio {

    public static void main(String[] args) {

        // Decimal a Hexadecimal
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Num. Decimal: ");
        int nd = input.nextInt();
        String nb = "";
        while(nd!=0){
            int r = nd % 16;
            nd = nd / 16;
            String c = "";
            if(r<10){
                c = String.valueOf(r);
            }
            else if(r==10){
                c = "A";
            }
            else if(r==11){
                c = "B";
            }
            else if(r==12){
                c = "C";
            }else if(r==13){
                c = "D";
            }
            else if(r==14){
                c = "E";
            }
            else if(r==15){
                c = "F";
            }

            nb = c + nb;
        }

        System.out.println("Num Binari: "+ nb);
    }
}
