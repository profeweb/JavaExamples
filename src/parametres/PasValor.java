package parametres;

public class PasValor {

    public static void main(String[] args){
        int n = 10;
        doIt(n);
        System.out.println(n);
        n = doIt2(n);
        System.out.println(n);
    }

    public static void doIt(int n){
        System.out.println(n);
        n++;
        System.out.println(n);
    }

    public static int doIt2(int n){
        System.out.println(n);
        n++;
        System.out.println(n);
        return n;
    }
}
