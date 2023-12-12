package strings;

public class CosesStrings {

    public static void main(String[] args) {
        String s = "Holelola";
        String t = "Hello";

        int numLletres = s.length();
        char c = s.charAt(1);
        String x = s.concat(t);
        int posA = s.indexOf('a');
        int posLA = s.indexOf("la");
        int posL = t.lastIndexOf('l');

        String st = s.substring(1, 4);  // ole
        String st2 = s.substring(2);

        String maj = "UEP";
        //System.out.println(maj.toLowerCase());

        String min = "hola";
        System.out.println(min.toUpperCase());

        boolean b = maj.startsWith("H") || maj.startsWith("h");

        String txt = "Hola Paco! com estàs Paco?";
        System.out.println(txt.replace("Paco", "Pep"));

    }
}
