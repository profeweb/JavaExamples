package strings;

public class PrintNumAsString {
    public static void main(String[] args) {
        String s = "ALELLULLA";
        int numAs = 0;
        for(int i =0; i<s.length(); i++){
            if(s.charAt(i)=='A'){
                numAs = numAs + 1;
            }
        }
        System.out.printf("%s té %d As.", s, numAs);

    }

}
