package sudoku;

public class SudokuGeneratorVF {

    public static int [][] grid;
    public static char separatorUnicode = '\u25CF';
    public static char emptyUnicode = ' ';

    public static void main(String[] args) {

        // Set the number of empty cells
        int k = 60;

        // Generate de sudoku grid
        grid = sudokuGenerator(k);

        // Print the generated Sudoku puzzle
        printSudoku(grid);

    }

    public static void printSudoku(int[][] grid){
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) {
                String separator = c > 0 && c % 3 == 0 ? " " + separatorUnicode + " " : " ";
                String value = grid[r][c] == 0 ? String.valueOf(emptyUnicode) : Integer.toString(grid[r][c]);
                System.out.printf("%s%s", separator, value);
            }
            System.out.println();

            if (r % 3 == 2 && r < grid.length - 1) {
                System.out.printf(" ");
                for (int c = 0; c < grid[r].length; c++) {
                    System.out.printf("%c ", separatorUnicode);
                    if (c % 3 == 2 && c < grid.length - 1) {
                        System.out.printf("%c ", separatorUnicode);
                    }
                }
                System.out.println();
            }
        }
    }

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

    // Check if it's safe to put num in row i
    // Ensure num is not already used in the row
    public static boolean unUsedInRow(int[][] grid, int i, int num) {
        for (int j = 0; j < 9; j++) {
            if (grid[i][j] == num) {
                return false;
            }
        }
        return true;
    }

    // Check if it's safe to put num in column j
    // Ensure num is not already used in the column
    public static boolean unUsedInCol(int[][] grid, int j, int num) {
        for (int i = 0; i < 9; i++) {
            if (grid[i][j] == num) {
                return false;
            }
        }
        return true;
    }

    // Remove K digits randomly from the grid
    // This will create a Sudoku puzzle by removing digits
    public static void removeKDigits(int[][] grid, int k) {
        while (k > 0) {
            // Pick a random cell
            int cellId = (int)(Math.random()*81);

            // Get the row index
            int i = cellId / 9;

            // Get the column index
            int j = cellId % 9;

            // Remove the digit if the cell is not already empty
            if (grid[i][j] != 0) {
                // Empty the cell
                grid[i][j] = 0;

                // Decrease the count of digits to remove
                k--;
            }
        }
    }

    // Fill remaining blocks in the grid
    // Recursively fill the remaining cells with valid numbers
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

    // Check if it's safe to put num in the cell (i, j)
    // Ensure num is not used in row, column, or box
    public static boolean checkIfSafe(int[][] grid, int i, int j, int num) {
        return (unUsedInRow(grid, i, num) && unUsedInCol(grid, j, num) &&
                noUsedInBox(grid, i - i % 3, j - j % 3, num));
    }

    // Fill the diagonal 3x3 matrices
    // The diagonal blocks are filled to simplify the process
    public static void fillDiagonal(int[][] grid) {
        for (int i = 0; i < 9; i = i + 3) {
            // Fill each 3x3 subgrid diagonally
            fillBox(grid, i, i);
        }
    }

    // Generate a Sudoku grid with K empty cells
    public static int[][] sudokuGenerator(int k) {
        // Initialize an empty 9x9 grid
        int[][] grid = new int[9][9];

        // Fill the diagonal 3x3 matrices
        fillDiagonal(grid);

        // Fill the remaining blocks in the grid
        fillRemaining(grid, 0, 0);

        // Remove K digits randomly to create the puzzle
        removeKDigits(grid, k);

        return grid;
    }
}
