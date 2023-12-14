package parametres;

public class SumaUn {

    public static void main(String[] args) {
        int x = 4;
        sumaUn(x);
        System.out.println(x);
    }

    public static void sumaUn(int n){
        System.out.println(n);
        n = n + 1;
        System.out.println(n);
    }
}
