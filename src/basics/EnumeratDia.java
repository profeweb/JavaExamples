package basics;

import java.util.Scanner;

public class EnumeratDia {

    public enum DiaSetmana { DL, DM, DC, DJ, DV, DS, DG};

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("AVUI: ");
        String s = input.next();
        DiaSetmana d = DiaSetmana.valueOf(s);
        System.out.println("DIA ES: "+d);

    }
}
