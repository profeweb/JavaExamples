package recursius;

public class FactorialRecursiu {

    public static void main(String[] args){

        System.out.printf("El factorial de %d és %d.\n", 5, factorial(5));

        System.out.printf("El factorial de %d és %d.\n", 8, factorial(8));

    }

    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        else {
            return n*factorial(n-1);
        }
    }
}
