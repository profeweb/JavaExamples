package strings;

public class FuncioCapicua {
    public static void main(String[] args) {

        String s1 = "rodador";
        System.out.printf("%s és capicua: %b.", s1, esCapicua(s1));

        String s2 = "aloha";
        System.out.printf("%s és capicua: %b.", s2, esCapicua(s2));
    }


    public static boolean esCapicua(String s){
        boolean capicua=  true ;
        int i = 0, j = s.length()-1;
        while (i > j && capicua){
            if(s.charAt(i) != s.charAt(j)){
                capicua = false;
            }
        }
        return capicua;
    }
}
