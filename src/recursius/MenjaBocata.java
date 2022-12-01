package recursius;

public class MenjaBocata {

    public static void main(String[] args){

        String bocata = "Bocatademortadela";
        menjar(bocata);
    }

    public static String mossegar(String s){
        int mida = 1 + (int) (Math.random()*4);
        return s.substring(0, mida);
    }

    public static boolean esTragable(String s){
        return s.length()<=4;
    }

    public static void tragar(String s){
        System.out.print(s);
        System.out.println("Ñam!");
    }

    public static String llevar(String b, String t){
        int n = t.length();
        return b.substring(n, b.length());
    }

    public static void menjar(String s){
        if(esTragable(s)){
            tragar(s);
        }
        else {
            String boci = mossegar(s);
            String resta = llevar(s, boci);
            menjar(boci);
            menjar(resta);
        }
    }
}
