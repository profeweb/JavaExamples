package recursius;

public class GirarParaula {

    public static void main(String[] args){

        String p = "Picatoste";

        System.out.printf("La paraula %s girada és %s.\n", p, girarIteratiu(p));
        System.out.printf("La paraula %s girada és %s.\n", p, girarRecursiu(p));
    }

    public static String girarIteratiu(String s){
        String r="";
        for(int i=s.length()-1; i>=0; i--){
            r += s.charAt(i);
        }
        return r;
    }

    public static String girarRecursiu(String s){
        if(s.length()==1){
            return s;
        }
        else {
            char primera = s.charAt(0);
            String resta = s.substring(1, s.length());
            return girarRecursiu(resta) + primera;
        }
    }
}
