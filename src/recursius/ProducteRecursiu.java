package recursius;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class ProducteRecursiu {

    public static void main(String[] args){
        System.out.printf("%d x %d és %d.", 3, 4, producte(3, 4));
    }

    public static int producte(int a, int b){
        if(b==0){
            return 0;
        }
        else {
            return producte(a, b-1) + a;
        }
    }
}
