package sudoku.step1;

public class SudokuGeneratorV1 {

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

        // Emplena totes les caselles amb un número aleatori entre 0 i 9
        for(int r=0; r<grid.length; r++){
            for(int c=0; c<grid[r].length; c++){
                grid[r][c] = (int)(Math.random()*10);
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
}
