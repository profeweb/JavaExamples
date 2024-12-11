package recursius;

public class DeletrejaRecursiu {

    public static void main(String[] args) {
        String s = "aloha";
        deletrejaString(s);
    }

    public static void deletrejaString(String s){
        if(s.length()==1){
            System.out.printf("%s", s);
        }
        else {
            System.out.printf("%c\n", s.charAt(0));
            String s2 = s.substring(1);
            deletrejaString(s2);
        }
    }
}
