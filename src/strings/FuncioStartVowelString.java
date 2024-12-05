package strings;

public class FuncioStartVowelString {
    public static void main(String[] args) {

        String s1 = "ALELULLA";
        System.out.printf("%s comença amb vocal: %b", s1, starsWithVowel(s1));

        String s2 = "MURCIELAGO";
        System.out.printf("%s comença amb vocal: %b", s2, starsWithVowel(s2));
    }


    public static boolean starsWithVowel(String s){
        char c = s.toUpperCase().charAt(0);
        return c=='A' ||  c=='E' || c=='I' || c=='O' || c=='U';
    }
}
