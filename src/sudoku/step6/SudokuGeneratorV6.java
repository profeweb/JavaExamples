package sudoku.step6;

import java.util.Scanner;

public class SudokuGeneratorV6 {

    // Graella del sudoku
    public static int [][] grid;

    // Símbols separador i casella buida
    public static char separatorUnicode = '\u25CF';
    public static char emptyUnicode = ' ';

    // Array de dificultats (caselles buides)
    public static int[] dificultat = {60, 40, 20, 10};

    public static void main(String[] args) {

        // Entrada del sistema
        Scanner input = new Scanner(System.in);

        // Nivell de dificultat
        System.out.print("Nivell de Dificultat [0 - 3]: ");
        int nivell = input.nextInt();

        // Número de caselles buides segons el nivell de dificultat
        int k = dificultat[nivell];

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

        // Esborra K caselles aleatòries del sudoku
        removeKDigits(grid, k);

        // Retorna l'array emplenat
        return grid;
    }

    // Imprimeix el sudoku
    public static void printSudoku(int[][] grid){

        // Per cada fila de la graella,
        for (int r = 0; r < grid.length; r++) {

            // Imprimeix les caselles
            for (int c = 0; c < grid[r].length; c++) {
                String separator = c > 0 && c % 3 == 0 ? " " + separatorUnicode + " " : " ";
                String value = grid[r][c] == 0 ? String.valueOf(emptyUnicode) : Integer.toString(grid[r][c]);
                System.out.printf("%s%s", separator, value);
            }
            System.out.println();

            // Cada 3 files imprimeix una línia de separació.
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

        // Si hem arriba al final
        if (i == 9) {
            return true;
        }

        // Ens movem a la segient fila
        if (j == 9) {
            return fillRemaining(grid, i + 1, 0);
        }

        // Només seguim si la casella no està ja emplenada
        if (grid[i][j] != 0) {
            return fillRemaining(grid, i, j + 1);
        }

        // Prova els números de l'1 al 9 en aquesta casella
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

    // Esborra k caselles de la graella del sudoku
    public static void removeKDigits(int[][] grid, int k) {
        while (k > 0) {

            // Agafa una casella aleatòria (0-81)
            int cellId = (int)(Math.random()*81);

            // Obté la fila de la casella
            int r = cellId / 9;

            // Obté la columna de la casella
            int c = cellId % 9;

            // Esborra el dígit de la casella si ja no estava esborrat
            if (grid[r][c] != 0) {

                // Buida la casella
                grid[r][c] = 0;

                // Decrementa el comptador de caselles pendents de ser esborrades
                k--;
            }
        }
    }
}
