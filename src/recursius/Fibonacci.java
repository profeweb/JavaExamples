package recursius;

public class Fibonacci {

    public static void main(String[] args){
        System.out.printf("El fibonacci de %d és %d.", 5, fibo(5));
    }

    public static int fibo(int n){
        if(n==0 || n==1){
            return 1;
        }
        else {
            return fibo(n-2)+fibo(n-1);
        }
    }
}
