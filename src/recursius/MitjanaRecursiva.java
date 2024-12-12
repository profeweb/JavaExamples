package recursius;

public class MitjanaRecursiva {

    public static void main(String[] args) {
        System.out.printf("La mitjana de %d i %d és %f.\n", 10, 20, mitjana(10, 20));
        System.out.printf("La mitjana de %d i %d és %f.\n", 10, 21, mitjana(10, 21));
    }

    public static float mitjana(int a, int b){
        if(a==b){
            return a;
        }
        else if(Math.abs(a-b)==1){
            return (a + b) / 2f;
        }
        else {
            int maxAB = Math.max(a, b);
            int minAB = Math.min(a, b);
            return mitjana(minAB+1, maxAB-1);
        }
    }
}
