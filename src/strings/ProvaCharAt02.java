package strings;

import java.util.Scanner;

public class ProvaCharAt02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter String: ");
        String s = input.next();

        System.out.print("Enter Index: ");
        int n = input.nextInt();

        char c = s.charAt(n);

        System.out.printf("Lletra %d de %s és %c.", n,s,c);
    }
}
