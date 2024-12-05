package strings;

public class FuncioCanviaAsPerEs {

    public static void main(String[] args) {
        String s1 = "ALELULLA";
        System.out.printf("%s canviant As per Es és %s.", s1, changeAsForEs(s1));

        String s2 = "BANANA";
        System.out.printf("%s canviant As per Es és %s.", s2, changeAsForEs(s2));
    }

    public static String changeAsForEs(String s){
        String s2 = "";
        for(int i = 0; i < s.length(); i++){
            if (s.charAt(i) == 'A'){
                s2 = s2 + 'E';
            }
            else {
                s2 = s2 + s.charAt(i);
            }
        }
        return  s2;
    }
}
