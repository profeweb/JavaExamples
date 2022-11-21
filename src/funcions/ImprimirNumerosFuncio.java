package funcions;

public class ImprimirNumerosFuncio {

    public static void main(String[] args){
        imprimirNumeros(1,3);
        System.out.println();
        imprimirNumeros(5, 10);
    }

    public static void imprimirNumeros(int n1, int n2){
        for(int i=n1; i<=n2; i++){
            System.out.println(i);
        }
    }

}
