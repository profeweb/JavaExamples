package recursius;

public class PotenciaRecursiva {

    public static void main(String[] args){
        System.out.printf("%d elevat a %d és %d.\n", 2, 3, potencia(2, 3));
        System.out.printf("%d elevat a %d és %d.\n", 2, 3, potencia2(2, 3));
    }

    public static int potencia(int b, int e){
        if(e==0){
            return 1;
        }
        else if(e%2==0){
            return potencia(b, e/2)*potencia(b, e/2);
        }
        else {
            return potencia(b, (e-1)/2)*potencia(b, (e-1)/2)*b;
        }
    }

    public static int potencia2(int b, int e){
        if(e==0){
            return 1;
        }
        else if(e%2==0){
            return potencia2(b, e/2)*potencia2(b, e/2);
        }
        else {
            return potencia2(b, e-1)*b;
        }
    }
}
