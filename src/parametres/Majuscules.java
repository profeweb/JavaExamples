package parametres;

public class Majuscules {

    public static void main(String[] args) {

        String x = "hello";
        majuscules(x);
        System.out.println(x);
    }

    public static void majuscules(String s){
        System.out.println(s);
        s = s.toUpperCase();
        System.out.println(s);
    }
}
