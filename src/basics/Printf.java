package basics;

import java.util.Scanner;

public class Printf {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String nom = input.next();

        System.out.print("Enter your age: ");
        int edat = input.nextInt();

        System.out.print("Enter your weight: ");
        float pes = input.nextFloat();

        System.out.print("Enter your blood group: ");
        char grup = input.next().charAt(0);

        System.out.print("Have you got allergies?: ");
        boolean alergies = input.nextBoolean();

        System.out.printf("My name is %s.%n I'm %d years old. My weight is %f. " +
                "My blood group is %c. Allergies: %b.", nom, edat, pes, grup, alergies);

    }
}
