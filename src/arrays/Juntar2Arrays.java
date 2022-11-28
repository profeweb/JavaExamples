package arrays;

public class Juntar2Arrays {
    public static void main(String[] args){

        int[] a = {3, 6, 8};
        int[] b = {4, 7, 9, 1, 2, 3, 11};

        int[] ab = juntar(a, b);

        for(int i=0; i<ab.length; i++){
            System.out.printf("%d\n", ab[i]);
        }

    }

    public static int[] juntar(int[] a, int[] b){
        int[] c = new int[a.length+b.length];
        for(int i=0; i<c.length; i++){
            if(i<a.length){
                c[i] = a[i];
            }
            else {
                c[i] = b[i-a.length];
            }
        }
        return c;
    }

    public static int[] juntar2(int[] a, int[] b){
        int[] c = new int[a.length+b.length];
        for(int i=0; i<a.length; i++){
            c[i] = a[i];
        }
        for(int i=0; i<b.length; i++){
            c[i+a.length] = b[i];
        }
        return c;
    }
}
