package recursius;

public class NumAsRecursiu {

    public static void main(String[] args) {
        String s = "Aloha";
        System.out.printf("%s té %d As.", s, numAs(s));
    }

    public static  int numAs(String s){
        if(s.length()==1){
            if(s.charAt(0)=='A' || s.charAt(0)=='a'){
                return 1;
            }
            else {
                return 0;
            }
        }
        else {
            String s1 = s.substring(0, 1);
            String s2 = s.substring(1);
            return numAs(s1) + numAs(s2);
        }
    }
}
