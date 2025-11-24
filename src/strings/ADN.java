package strings;

public class ADN {

    public static void main(String[] args) {
        System.out.print(generaADN(100));
    }

    public static String generaADN(int n){
        String adn = "";
        for(int i=0; i<n; i++){
            char lletra;
            int nr = (int) (Math.random()*100);
            if(nr<=25){      lletra = 'A'; }
            else if(nr<=50){ lletra = 'C'; }
            else if(nr<=75){ lletra = 'G'; }
            else {           lletra = 'T'; }

            adn += lletra;
        }
        return adn;
    }

    public static boolean hihaSatellit(String satellit){
        return true;
    }

    public static int quantsSatellit(String satellit){
        return 0;
    }
}
