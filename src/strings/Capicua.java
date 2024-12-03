package strings;

public class Capicua {
    public static void main(String[] args) {
        String s = "rodador";
        boolean capicua=  true ;
        int i = 0, j = s.length()-1;
        while (i > j && capicua){
            if(s.charAt(i) != s.charAt(j)){
                capicua = false;
            }
        }
        System.out.printf("%s és capicua: %b.", s, capicua);
    }
}
