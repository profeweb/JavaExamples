package basics;

public class ExempleConstant {

    public static void main(String[] args) {

        int x = 4;  // Variable (pot canviar el seu valor)
        x ++;

        final int Y = 8;  // Constant ( no pot canviar el seu valor)
        // Y ++; (Error)
        // Y = 2; (Error)
    }
}
