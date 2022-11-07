package basics;

public class ImprimirBooleans {
    public static void main(String[] args) {

        boolean a = true;
        boolean b = false;
        boolean c = a && b;      // a AND b
        boolean d = a || b;      // a OR b
        boolean e = !a;          // NOT a

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}
