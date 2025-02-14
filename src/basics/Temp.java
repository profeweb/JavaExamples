package basics;

public class Temp {

    public static void main(String[] args) {

            String s = "FA1B";

            int numLletres = s.length();
            char darrera = s.charAt(numLletres-1);
            String davant = s.substring(0, numLletres-1);
            System.out.printf("%c i %s", darrera, davant);

    }
}
