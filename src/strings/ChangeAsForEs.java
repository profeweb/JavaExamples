package strings;

public class ChangeAsForEs {

    public static void main(String[] args) {
        String s = "ALELULLA";
        String s2 = "";

        for(int i = 0; i < s.length(); i++){
            if (s.charAt(i) == 'A'){
                s2 = s2 + 'E';
            }
            else {
                s2 = s2 + s.charAt(i);
            }
        }
        System.out.printf("%s canviant As per Es és %s.", s, s2);
    }
}
