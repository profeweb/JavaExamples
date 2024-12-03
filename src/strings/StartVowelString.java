package strings;

public class StartVowelString {
    public static void main(String[] args) {

        String s = "ALELULLA";

        boolean vowel = s.charAt(0)=='A' || s.charAt(0)=='E' ||
                s.charAt(0)=='I' || s.charAt(0)=='O' || s.charAt(0)=='U';

        System.out.printf("%s comença amb vocal: %b", s, vowel);
    }
}
