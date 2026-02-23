package cerca;

public class Cerca {

    public static void main(String[] args) {

        int[] a = {4, 8, 1, 5, 9, 3};
        int[] b = {1, 3, 4, 5, 8, 9};

        System.out.println("CERCA LINEAL (No Ordenada).");
        System.out.printf("Posició de %d dins l'array A: %d.\n", 5, cercaLineal(a, 5));
        System.out.printf("Posició de %d dins l'array A: %d.\n", 7, cercaLineal(a, 7));

        System.out.println("CERCA LINEAL ORDENADA.");
        System.out.printf("Posició de %d dins l'array B: %d.\n", 5, cercaLinealOrdenada(b, 5));
        System.out.printf("Posició de %d dins l'array B: %d.\n", 7, cercaLinealOrdenada(b, 7));

        System.out.println("CERCA BINÀRIA / DICOTÒMICA.");
        System.out.printf("Posició de %d dins l'array B: %d.\n", 5, cercaBinari(b, 5, 0, b.length-1));
        System.out.printf("Posició de %d dins l'array B: %d.\n", 7, cercaBinari(b, 7, 0, b.length-1));

        System.out.println("CERCA BINÀRIA / DICOTÒMICA RECURSIVA.");
        System.out.printf("Posició de %d dins l'array B: %d.\n", 5, cercaBinariR(b, 5, 0, b.length-1));
        System.out.printf("Posició de %d dins l'array B: %d.\n", 7, cercaBinariR(b, 7, 0, b.length-1));

    }

    public static int cercaLineal(int[] a ,int v){
        for(int i=0; i<a.length; i++){
            if(a[i]==v){
                return i;
            }
        }
        return -1;
    }

    public static int cercaLinealOrdenada(int[] a, int v){
        int i=0;
        while(i<a.length && a[i]<=v){
            if(a[i]==v){
                return i;
            }
            i++;
        }
        return -1;
    }

    public static int cercaBinari(int[] a, int v, int bot, int top){
        while(bot<=top) {
            int mid = (top + bot) / 2;
            if (a[mid] == v) {
                return mid;
            } else if (a[mid] > v) {
                top = mid-1;
            } else if (a[mid] < v) {
                bot = mid+1;
            }
        }
        return -1;
    }

    public static int cercaBinariR(int[] a, int v, int bot, int top){
        if(bot <= top){
            int mid = (top + bot)/2;
            if(a[mid]==v){
                return mid;
            }
            else if(a[mid]>v){
                return cercaBinari(a, v, bot, mid-1);
            }
            else if(a[mid]<v){
                return cercaBinari(a, v, mid+1, top);
            }
        }
        return -1;
    }
}
