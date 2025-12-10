package sudoku.step4;

public class SudokuGeneratorV4 {

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

        // Emplena les matrius diagonals
        fillDiagonal(grid);

        // Emplena la resta de caselles
        fillRemaining(grid, 0, 0);

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
                    // Generate a random number between 1 and 9
                    num = (int)(Math.random()*9) + 1;
                } while (!noUsedInBox(grid, row, col, num));
                grid[row + i][col + j] = num;
            }
        }
    }

    // Determina si un número num no apareix en una fila r
    public static boolean noUsedInRow(int[][] grid, int r, int num) {
        for (int c = 0; c < 9; c++) {
            if (grid[r][c] == num) {
                return false;
            }
        }
        return true;
    }

    // Determina si un número num no apareix en una columna c
    public static boolean noUsedInCol(int[][] grid, int c, int num) {
        for (int r = 0; r < 9; r++) {
            if (grid[r][c] == num) {
                return false;
            }
        }
        return true;
    }

    // Emplena les matrius de la diagonal per a simplificar el procés
    public static void fillDiagonal(int[][] grid) {
        for (int i = 0; i < 9; i = i + 3) {
            fillBox(grid, i, i);
        }
    }


    // Comprova si es pot posar el número num en la casella (r, c)
    public static boolean checkIfSafe(int[][] grid, int r, int c, int num) {
        return (noUsedInRow(grid, r, num) &&
                noUsedInCol(grid, c, num) &&
                noUsedInBox(grid, r - r % 3, c - c % 3, num));
    }

    // Emplena la resta de matrius de forma recursiva amb números vàlids
    public static boolean fillRemaining(int[][] grid, int i, int j) {

        // If we've reached the end of the grid
        if (i == 9) {
            return true;
        }

        // Move to next row when current row is finished
        if (j == 9) {
            return fillRemaining(grid, i + 1, 0);
        }

        // Skip if cell is already filled
        if (grid[i][j] != 0) {
            return fillRemaining(grid, i, j + 1);
        }

        // Try numbers 1-9 in current cell
        for (int num = 1; num <= 9; num++) {
            if (checkIfSafe(grid, i, j, num)) {
                grid[i][j] = num;
                if (fillRemaining(grid, i, j + 1)) {
                    return true;
                }
                grid[i][j] = 0;
            }
        }
        return false;
    }
}
