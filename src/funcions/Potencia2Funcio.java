package funcions;

public class Potencia2Funcio {

    public static void main(String[] args){
        int x = potencia2(10);
        System.out.printf("La potencia %d de 2 és %d", 10, x);
    }

    public static int potencia2(int n){
        int i=1;
        int p = 1;
        while(i<=n){
            p = p*2;
            i++;
        }
        return p;
    }
}
