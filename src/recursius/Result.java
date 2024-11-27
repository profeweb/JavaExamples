package recursius;

public class Result {

    public static void main(String[] args) {
        int r = result(3, 4);
        System.out.printf("R val %d.", r);

        double r4 = result4(2, 5, 6, 7);
        System.out.printf("R4 val %d.", r4);
    }

    public static int result(int x, int y){
        if(x==0){
            return 0;
        }
        else if(y==0){
            return 1;
        }
        else {
            return (x+y)*result(x, y-1);
        }
    }

    public static double result4 ( double x, int y, double z, int v) {
        double sum = x + y + z;
        if (sum > 12*v){
            return result( v , y );
        }
        else {
            if ((y < x/2) && (v-3 >= 0 && y-3 >= 0)){
                return result4( x, y-3, z, v-3);
            }
            else {
                return result( 0 , 0 );
            }
        }
    }

}
