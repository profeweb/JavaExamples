package basics;

import java.util.Scanner;

public class ImprimirInfoInput {

    public enum Sexe {HOME, DONA, ALTRE};

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("NOM: ");
        String nom = input.next();

        System.out.print("EDAT: ");
        int edat = input.nextInt();

        System.out.print("ALTURA: ");
        float altura = input.nextFloat();

        System.out.print("GRUP SANGUINI: ");
        char grup = input.next().charAt(0);

        System.out.print("SEXE (HOME, DONA, ALTRE): ");
        String s = input.next();
        Sexe sexe = Sexe.valueOf(s);

        System.out.println("En/na: "+nom+", té :"+edat+" anys, medeix "+altura+"m, té el grup sanguini "+grup+" i el sexe "+sexe);
    }
}
