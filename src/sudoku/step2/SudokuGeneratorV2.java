package sudoku.step2;

public class SudokuGeneratorV2 {

    // Graella del sudoku
    public static int [][] grid;

    public static void main(String[] args) {

        // Número de caselles buides
        int k = 20;

        // Genera el sudoku
        grid = sudokuGenerator(k);

        // Imprimeix el sudoku
        printSudoku(grid);

    }

    // Genera el Sudoku
    public static int[][] sudokuGenerator(int k) {

        // Inicialitza un array bidimensional de 9x9
        int[][] grid = new int[9][9];

        // Emplena totes les graelles sense repetits
        for(int r=0; r<9; r+=3){
            for(int c=0; c<9; c+=3){
                fillBox(grid, r, c);
            }
        }

        // Retorna l'array emplenat
        return grid;
    }

    // Imprimeix el sudoku
    public static void printSudoku(int[][] grid){

        // Per cada fila de la graella,
        for (int r = 0; r < grid.length; r++) {

            // Imprimeix les caselles
            for (int c = 0; c < grid[r].length; c++) {
                String separator = c > 0 && c % 3 == 0 ? " | " : " ";
                String value = grid[r][c] == 0 ? " " : Integer.toString(grid[r][c]);
                System.out.printf("%s%s", separator, value);
            }
            System.out.println();

            // Cada 3 files imprimeix una línia de separació.
            if (r % 3 == 2 && r < grid.length - 1) {
                System.out.printf(" ");
                for (int c = 0; c < grid[r].length; c++) {
                    System.out.printf("- ");
                    if (c % 3 == 2 && c < grid.length - 1) {
                        System.out.printf("  ");
                    }
                }
                System.out.println();
            }
        }
    }

    // Determina si un número no es troba en una subgraella del sudoku
    public static boolean noUsedInBox(int[][] grid, int rowStart, int colStart, int num){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grid[rowStart + i][colStart + j] == num) {
                    return false;
                }
            }
        }
        return true;
    }

    // Emplena una subgraella del sudoku sense repetits
    public static void fillBox(int[][] grid, int row, int col) {
        int num;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do {
                    // Genera un número aleatori entre 1 i 9
                    num = (int)(Math.random()*9) + 1;
                } while (!noUsedInBox(grid, row, col, num));
                grid[row + i][col + j] = num;
            }
        }
    }
}
