public class SudokuBoard {
    private int[][] grid;

    public SudokuBoard() {
        // Tabuleiro exemplo com alguns números preenchidos
        grid = new int[][] {
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };
    }

    public void display() {
        for (int i = 0; i < 9; i++) {
            if (i % 3 == 0 && i != 0) {
                System.out.println("------+-------+------");
            }
            for (int j = 0; j < 9; j++) {
                if (j % 3 == 0 && j != 0) {
                    System.out.print("| ");
                }
                System.out.print(grid[i][j] == 0 ? ". " : grid[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int[][] getGrid() {
        return grid;
    }

    public void setValue(int row, int col, int value) {
        grid[row][col] = value;
    }

    public boolean isComplete() {
        for (int[] row : grid) {
            for (int cell : row) {
                if (cell == 0) return false;
            }
        }
        return true;
    }
}
