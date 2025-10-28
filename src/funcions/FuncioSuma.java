package funcions;

public class FuncioSuma {

    public static void main(String[] args){

        int s1 = suma(3, 5);
        System.out.printf("La suma de %d i %d és %d.", 3, 5, s1);

        int s2 = suma(10, 20);
        System.out.printf("La suma de %d i %d és %d.", 10, 20, s2);
    }

    public static int suma(int a, int b){
        return a+b;
    }

}
