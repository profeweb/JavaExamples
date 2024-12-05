package strings;

public class FuncioNumAsString {
    public static void main(String[] args) {

        String s1 = "ALELLULLA";
        System.out.printf("%s té %d As.", s1, numAs(s1));

        String s2 = "BANANA";
        System.out.printf("%s té %d As.", s2, numAs(s2));

    }

    public static int numAs(String s){
        int n = 0;
        for(int i =0; i<s.length(); i++){
            if(s.charAt(i)=='A' || s.charAt(i)=='a'){
                n = n + 1;
            }
        }
        return n;
    }

}
