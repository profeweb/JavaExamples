package bucles;

public class PrintNumbersAndChars {

    public static void main(String[] args) {

        char c = 65;
        for(int i=1; i<=10; i++){
            System.out.printf("Número: %d i Lletra: %c.%n", i, c);
            c++;
        }
    }
}
