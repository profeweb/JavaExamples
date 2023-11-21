package bucles;

public class AbecedariContinue {
    public static void main(String[] args) {

        for(char c='A'; c<='z'; c++){
            if(c>=91 && c<=96){
                continue;
            }

            if(c!='z') {
                System.out.print(c + ", ");
            }
            else {
                System.out.print(c + ".");
            }
        }
    }
}
