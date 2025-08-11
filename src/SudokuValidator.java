public class SudokuValidator {

    public static boolean isMoveValid(int[][] grid, int row, int col, int value) {
        // Se já tiver um número na posição, não pode alterar
        if (grid[row][col] != 0) return false;

        // Valida linha
        for (int i = 0; i < 9; i++) {
            if (grid[row][i] == value) return false;
        }

        // Valida coluna
        for (int i = 0; i < 9; i++) {
            if (grid[i][col] == value) return false;
        }

        // Valida bloco 3x3
        int startRow = row - row % 3;
        int startCol = col - col % 3;

        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (grid[i][j] == value) return false;
            }
        }

        return true;
    }
}
