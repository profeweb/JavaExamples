package bucles;

public class Abecedari2 {
    public static void main(String[] args) {

        for(char C='A', c='a'; c<='z' && C<='Z'; c++, C++){
            System.out.println(C + " "+c);
        }
    }
}
