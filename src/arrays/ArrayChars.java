package arrays;

public class ArrayChars {

    public static void main(String[] args) {
        String s = "holaquetal";
        char[] ac = arrayChars(s);
        imprimirArray(ac);
    }

    public static char[] arrayChars(String s){
        char[] array = new char[s.length()];
        for(int i=0; i<array.length; i++){
            array[i] = s.charAt(i);
        }
        return array;
    }

    public static void imprimirArray(char[] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
