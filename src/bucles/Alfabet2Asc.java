package bucles;

public class Alfabet2Asc {
    public static void main(String[] args){

        for(char C ='A', c='a'; C<='Z' && c<='z'; c++, C++) {
            System.out.println(C + " " + c);
        }
    }
}
