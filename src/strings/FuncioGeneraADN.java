package strings;

public class FuncioGeneraADN {

    public static void main(String[] args) {
        int n = 100;
        String adn = generaADN(n);
        System.out.printf("ADN de %d lletres:\n%s.\n", n, adn);

        String ms = "TA";
        System.out.printf("%s apareix a l'adn? %b.\n", ms, hihaSatelit(adn, ms));
        System.out.printf("%s apareix %d vegades a l'adn.", ms, vegadesSatelit(adn, ms));
    }

    public static String generaADN(int num){
        char[] simbols = {'C', 'A', 'G', 'T'};
        String adn = "";
        for(int i=0; i<num; i++){
            int s = (int) Math.floor(Math.random()*4);
            adn = adn + simbols[s];
        }
        return adn;
    }

    public static boolean hihaSatelit(String adn, String satelit){
        return adn.indexOf(satelit)!=-1;
    }

    public static int vegadesSatelit(String adn, String satelit){
        int times = 0;
        while (adn.indexOf(satelit)!=-1){
            int pos = adn.indexOf(satelit);
            times++;
            adn = adn.substring(pos+1);
        }
        return times;
    }

}
