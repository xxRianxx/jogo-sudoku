import java.util.Scanner;

public class SudokuGame {
    private SudokuBoard board;
    private Scanner scanner;

    public SudokuGame() {
        board = new SudokuBoard();
        scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("=== Bem-vindo ao Sudoku ===");
        while (true) {
            board.display();

            System.out.print("Digite a linha (0-8) ou -1 para sair: ");
            int row = scanner.nextInt();
            if (row == -1) break;

            System.out.print("Digite a coluna (0-8): ");
            int col = scanner.nextInt();

            System.out.print("Digite o valor (1-9): ");
            int value = scanner.nextInt();

            if (SudokuValidator.isMoveValid(board.getGrid(), row, col, value)) {
                board.setValue(row, col, value);
            } else {
                System.out.println("Movimento inválido! Tente novamente.");
            }

            if (board.isComplete()) {
                board.display();
                System.out.println("Parabéns! Você completou o Sudoku!");
                break;
            }
        }
    }
}
