package conversions;
import java.util.Scanner;

public class Decimal2ComplementA2 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Decimal number (positive / negative): ");
        int nd = input.nextInt();

        // Passar a binari el número (positiu)
        int[] nb = decimalToBinary(Math.abs(nd));

        System.out.println("Array del número en binari (positiu):");
        printArray(nb);

        // Si el número és negatiu
        if(nd<0){

            // 1r Complement
            nb = complement(nb);
            System.out.println("Array del número complementat:");
            printArray(nb);

            // 2n Suma 1
            nb = sumaUn(nb);
            System.out.println("Array del número sumat 1:");
            printArray(nb);
        }

        // Output del resultat
        System.out.printf("Decimal number %d is binary C2: ", nd);
        printArray(nb);
    }

    public static int[] decimalToBinary(int nd){
        int nb[] = new int[8];
        int index = 7;
        int pot = 1;
        while(nd!=0 && index>=0){
            int r = nd % 2;
            nd = nd / 2;
            nb[index] = r;
            pot = 10* pot;
            index--;
        }
        return nb;
    }

    public static void printArray(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]);
        }
        System.out.println();
    }

    public static int[] complement(int[] array){
        int [] compArray = new int[array.length];
        for(int i=0; i<array.length; i++){
            compArray[i] = (array[i]==0)? 1 : 0;
        }
        return compArray;
    }

    public static int[] sumaUn(int[] array){
        int [] sumArray = new int[array.length];
        int carry = 1;
        for(int i=array.length-1; i>=0; i--) {
            if (array[i] + carry == 0){
                sumArray[i] = 0;
                carry = 0;
            }
            else if (array[i] + carry == 1){
                sumArray[i] = 1;
                carry = 0;
            }
            else if (array[i] + carry == 2){
                sumArray[i] = 0;
                carry = 1;
            }
        }
        return sumArray;
    }


}
