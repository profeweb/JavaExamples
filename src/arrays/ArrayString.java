package arrays;

public class ArrayString {
    public static void main(String[] args){

        String textS = "HolaQueTal";
        char[] textA = stringToArray(textS);
        printArray(textA);
    }

    public static char[] stringToArray(String s){
        char[] m = new char[s.length()];
        for(int i=0; i<s.length(); i++){
            m[i] = s.charAt(i);
        }
        return m;
    }

    public static void printArray(char[] t){
        for(int i=0; i<t.length; i++){
            System.out.printf("%d : %c\n", i, t[i]);
        }
    }
}
