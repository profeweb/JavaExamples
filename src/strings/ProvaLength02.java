package strings;

import java.util.Scanner;

public class ProvaLength02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter String: ");
        String s = input.next();

        System.out.printf("Llarg de %s és %d.", s, s.length());
    }
}
