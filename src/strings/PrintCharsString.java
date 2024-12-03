package strings;

public class PrintCharsString {

    public static void main(String[] args) {

        String s = "Hello";
        for(int i =0; i<s.length(); i++){
            System.out.printf("%d : %c.\n", i, s.charAt(i));
        }

    }
}
