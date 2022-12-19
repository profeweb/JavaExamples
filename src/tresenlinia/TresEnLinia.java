package tresenlinia;

public class TresEnLinia {
    public static void main(String[] args){
        initTauler();
        printTauler();
    }

    public enum VALOR {BUIDA, X, O};
    public static VALOR[][] tauler;

    public static void initTauler(){
        tauler = new VALOR[3][3];
        for(int f=0; f<tauler.length; f++){
            for(int c=0; c<tauler[0].length; c++) {
                tauler[f][c] = VALOR.BUIDA;
            }
        }
    }

    public static void printTauler(){
        for(int f=0; f<tauler.length; f++){
            for(int c=0; c<tauler[0].length; c++) {
                if(tauler[f][c]==VALOR.BUIDA) {
                    System.out.printf(" \t");
                }
                else {
                    System.out.printf("%s \t", tauler[f][c]);
                }
            }
            System.out.println();
        }
    }
}
