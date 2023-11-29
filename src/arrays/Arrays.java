package arrays;

public class Arrays {

    public static void main(String[] args) {
        int[] nums1 = {2, 6, 4, 8, 0, 1};
        int[] nums2 = {0, 1, 3, 2, 8, 2};

        int[] nouArray = suma2Arrays(nums1, nums2);
        printArray(nouArray);

    }

    public static int[] potencies2(int n){
        int[] p = new int[n];
        for(int i=0; i<p.length; i++){
            p[i] = (int) Math.pow(2, i);
        }
        return p;
    }

    public static int[] juntaArrays(int[] a, int[] b){
        int[] c = new int[a.length + b.length];
        for(int i=0; i<c.length; i++){
            if(i<a.length){
                c[i] = a[i];
            }
            else {
                c[i] = b[i - a.length];
            }
        }
        return c;
    }

    public static int[] suma2Arrays(int[] a, int[] b){
        int[] s = new int[a.length];
        for(int i=0; i<a.length; i++){
            s[i] = a[i] + b[i];
        }
        return s;
    }

    public static int[] creaArray(int a, int b){
        int[] x = new int[(b-a)+1];
        for (int i=0; i<x.length; i++){
            x[i] = a + i;
        }
        return x;
    }

    public static boolean iguals(int[] a, int[] b){
        if(a.length != b.length){
            return false;
        }
        else {
            for(int i=0; i<a.length; i++){
                if(a[i]!=b[i]){
                    return false;
                }
            }
            return true;
        }
    }



    public static int[] trosArray(int[] a, int x, int y){
        int[] t = new int[y-x+1];
        for(int i=x, j=0; i<=y && j<t.length; i++, j++){
            t[j] = a[i];
        }
        return t;
    }

    public static int[] copiaArray(int[] a){
        int[] c = new int[a.length];
        for(int i=0; i<a.length; i++){
            c[i] = a[i];
        }
        return c;
    }

    public static void printArray(int[] a){
        for(int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }
    }


}
