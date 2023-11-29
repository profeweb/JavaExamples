package arrays;

public class Suma2ArraysDiferents {
    public static void main(String[] args){

        int[] a = {2, 6, 8, 2, 0};
        int[] b = {0, 3, 1, 5, 4, 6, 8, 1};

        int[] c = sumaArraysDiferents(a, b);

        for(int i=0; i<c.length; i++){
            System.out.printf("%d\n", c[i]);
        }
    }

    public static int[] sumaArraysDiferents(int[] a, int[] b){

        int lMax = maxim(a.length, b.length);
        int lMin = minim(a.length, b.length);

        int[] s = new int[lMax];

        for(int i=0; i<s.length; i++){
            if(i<lMin) {
                s[i] = a[i] + b[i];
            }
            else {
                s[i] = (a.length> b.length) ? a[i] : b[i];
            }
        }
        return s;
    }

    public static int maxim(int a, int b){
        return (a>b) ? a : b;
    }

    public static int minim(int a, int b){
        return (a<b) ? a : b;
    }
}
