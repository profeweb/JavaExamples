package recursius;

public class CapicuaRecursiu {

    public static void main(String[] args){

        System.out.printf("%s és capicua? %b.\n", "ahha", esCapicua("ahha"));

        System.out.printf("%s és capicua? %b.\n", "ahxoyha", esCapicua("ahxoyha"));

    }

    public static boolean esCapicua(String s){
        if(s.length()==1){
            return true;
        }
        else if(s.length()==2){
            return s.charAt(0)==s.charAt(1);
        }
        else {
            return s.charAt(0)==s.charAt(s.length()-1) &&
                    esCapicua(s.substring(1, s.length()-1));
        }
    }
}
