package recursius;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class MCMRecursiu {

    public static void main(String[] args){

        int a = 12;
        int b = 9;

        System.out.printf("MCM de %d i %d és %d.", 12, 9, mcm(a, b));
    }

    public static int mcm(int m, int n){
        if(m==0 || n==0){
            return 0;
        }
        else {
            return Math.abs(m*n) / mcd(m, n);
        }
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
