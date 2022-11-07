package basics;

public class ImprimirChars {
    public static void main(String[] args) {

        char a = 'a';
        char b = '5';
        char c = '\"';        // special char "
        char d = '\071';      // octal unicode & char type
        char e = '\u0061';    // hexa unicode & char type

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}
