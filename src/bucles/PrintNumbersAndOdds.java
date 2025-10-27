package bucles;

public class PrintNumbersAndOdds {

    public static void main(String[] args) {

        for(int i=1; i<=10; i++){
            System.out.printf("Número: %d i Parell: %b.%n", i, i%2==0 );
        }
    }
}
