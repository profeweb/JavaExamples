package bocata;

public class Bocata {

    public static void main(String[] args) {
        String bocata="Bocatademortadela";
        //menjar(bocata);

        for(int i=0; i<10; i++) {
            int d = (int)(Math.random()*4) +1 ;
            System.out.println(d);
        }


    }

    public static void menjar(String b){
        if(esTragable(b)){
            tragar(b);
        }
        else {
            String boci = mossegar(b);
            String restant = llevar(b, boci);
            menjar(boci);
            menjar(restant);
        }
    }

    public static String mossegar(String b){
        return b.substring(0, 1);
    }

    public static  boolean esTragable(String b){
        return b.length() == 1;
    }

    public static void tragar(String b){
        System.out.println(b);
        System.out.println("Nyam!!!");
    }

    public static String llevar(String b, String t){
        return b.replaceFirst(t, "");
        //return b.substring(1, b.length()-1);
    }
}
