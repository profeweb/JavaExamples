package repas;

import static java.lang.Math.min;

public class OperacionsConjunts {

    public static void main(String[] args){

        int[] a = {3, 7, 8, 1, 4};
        int[] b = {2, 7, 1, 6, 9};

        //System.out.printf("%d dins array A: %b.\n", 5, estaDinsArray(5, a));
        //System.out.printf("%d dins array A: %b.\n", 8, estaDinsArray(8, a));

        int[] c = unioAmbRepetits(a, b);
        int[] d = unioSenseRepetits(a, b);
        int[] e = interseccio(a, b);
        int[] f = diferencia(a, b);

        //imprimirArray(f);

        int[] x = {-3, 6, -2, -1, 7, 9};
        int[] pos = new int[x.length];
        int[] neg = new int[x.length];
        separa(x, pos, neg);
        System.out.println("Positius: ");
        imprimirArray(pos);
        System.out.println("Negatius: ");
        imprimirArray(neg);


    }

    public static void imprimirArray(int[] a){
        for(int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }
    }

    public static int[] unioAmbRepetits(int[] a, int[] b){
        int[] c = new int[a.length + b.length];
        for(int i=0; i<a.length; i++){
            c[i] = a[i];
        }
        for(int i=0; i<b.length; i++){
            c[i + a.length] = b[i];
        }
        return c;
    }

    public static int[] unioSenseRepetits(int[] a, int[] b){
        int[] c = new int[a.length + b.length];

        for(int i=0; i<a.length; i++){
            c[i] = a[i];
        }

        int nb = 0;
        for(int i=0; i<b.length; i++){
            if(!estaDinsArray(b[i], a)){
                c[nb + a.length] = b[i];
                nb++;
            }
        }
        return c;
    }

    public static boolean estaDinsArray(int n, int[] a){
        boolean trobat = false;
        int i=0;
        while(i<=a.length-1 && trobat==false){
            if(a[i]==n){
                trobat = true;
            }
            i++;
        }
        return trobat;
    }

    public static int[] interseccio(int[] a, int[] b){
        int[] c = new int[ min(a.length, b.length)];
        int nc = 0;
        if(a.length<b.length){
            for(int i=0; i<a.length; i++){
                if(estaDinsArray(a[i], b)){
                    c[nc] = a[i];
                    nc++;
                }
            }
        }
        else {
            for(int i=0; i<b.length; i++){
                if(estaDinsArray(b[i], a)){
                    c[nc] = b[i];
                    nc++;
                }
            }
        }
        return c;
    }

    public static int[] diferencia(int[] a, int[] b){
        int[] c =  new int[a.length];
        int nc = 0;
        for(int i=0; i<a.length; i++){
            if(!estaDinsArray(a[i], b)){
                c[nc] = a[i];
                nc++;
            }
        }
        return c;
    }

    public static void separa(int[] a, int[] pos, int[] neg){
        int np = 0, nn=0;
        for(int i=0; i<a.length; i++){
            if(a[i]>0){
                pos[np] = a[i];
                np++;
            }
            else if(a[i]<0){
                neg[nn] = a[i];
                nn++;
            }
        }
    }
}
