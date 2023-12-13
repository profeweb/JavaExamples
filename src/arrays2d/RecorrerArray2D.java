package arrays2d;

public class RecorrerArray2D {

    public static void main(String[] args) {
        String[][] noms = {
                {"Paco", "Pep", "Jaume"},
                {"Bel", "Maria", "Toni"},
                {"Jordi", "Maria", "Gori"},
        };

        //imprimirPerFiles(noms);
        //imprimirPerColumnes(noms);
        //imprimirDiagonalDesc(noms);
        imprimirDiagonalAsc(noms);
    }

    public static void imprimirPerFiles(String[][] array){
        for (int i=0; i<array.length; i++){
            for (int j=0; j<array[i].length; j++) {
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public static void imprimirPerColumnes(String[][] array){

        for (int j=0; j<array[0].length; j++) {
            for (int i=0; i<array.length; i++){
                System.out.println(array[i][j]);
            }
        }
    }

    public static void imprimirDiagonalDesc(String[][] array){
        for (int j=0; j<array[0].length; j++) {
            for (int i=0; i<array.length; i++){
                if(i==j) {
                    System.out.println(array[i][j]);
                }
            }
        }
    }

    public static void imprimirDiagonalDescOK(String[][] array){
        for (int i=0; i<array[0].length; i++) {
            System.out.println(array[i][i]);
        }
    }

    public static void imprimirDiagonalAsc(String[][] array){
        for (int j=0, i = array.length-1; j<array[0].length; j++, i--) {
            System.out.println(array[i][j]);
        }
    }
}
