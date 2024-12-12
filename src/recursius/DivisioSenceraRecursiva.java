package recursius;

public class DivisioSenceraRecursiva {

    public static void main(String[] args){
        System.out.printf("%d / %d és %d.", 10, 4, divisio(10, 4));
    }

    public static int divisio(int a, int b){
        if(a<b){
            return 0;
        }
        else {
            return 1 + divisio(a-b, b);
        }
    }
}
