package recursius;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class MCDRecursiu {

    public static void main(String[] args){
        System.out.printf("MCD de %d i %d és %d.", 12, 9, mcd(12, 9));
    }

    public static int mcd(int a, int b){
        int max = max(a, b);
        int min = min(a, b);
        if(max%min==0){
            return min;
        }
        else {
            return mcd(min, max%min);
        }
    }
}
