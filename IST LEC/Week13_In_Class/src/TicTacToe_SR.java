import java.util.Scanner;

public class TicTacToe_SR {
    // static global variable
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // Program description
        System.out.println("This program will play a game of Tic Tac Toe.\n");

        // Declaring the variables: types and names
        final char[] players = {'O', 'X'};
        char[][] board = new char[3][3];

        // Variable initialization: getting the input from the user
        initializeBoard(board);

        // Play the game
        play(board, players);
    }

    public static void initializeBoard(char[][] board) {
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[r].length; c++) {
                board[r][c] = '?';
            }
        }
    }

    public static void displayBoard(char[][] board) {
        // Heading row
        System.out.print("  ");
        for (int i = 0; i < board.length; i++) {
            System.out.printf("%2d ", i);
        }
        System.out.println();

        // Display board
        for (int r = 0; r < board.length; r++) {
            System.out.printf("%2d ", r);
            for (int c = 0; c < board[r].length; c++) {
                System.out.printf("|%2c", board[r][c]);
            }
            System.out.println("|");
        }
    }

    public static int switchPlayer(int currentPlayer) {
        return currentPlayer == 0 ? 1 : 0;
    }

    public static void makeAMove(char[][] board, char player) {
        int row, col;
        boolean valid = false;
        do {
            System.out.print("Enter row and column (separated by space): ");
            row = input.nextInt();
            col = input.nextInt();
            // validate input first
            if (row < 0 || row > 2 || col < 0 || col > 2) {
                System.out.println("Invalid move. Try again.");
            } else if (board[row][col] != '?') {
                System.out.println("That position is already taken. Try again.");
            } else {
                board[row][col] = player;
                valid = true;
            }
        } while (!valid);
    }

    public static boolean isWinner(char[][] board, char player) {
        // Check rows
        for (int r = 0; r < board.length; r++) {
            if (board[r][0] == player && board[r][1] == player && board[r][2] == player) {
                return true;
            }
        }

        // Check columns
        for (int c = 0; c < board[0].length; c++) {
            if (board[0][c] == player && board[1][c] == player && board[2][c] == player) {
                return true;
            }
        }

        // Check diagonals
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }

        return false;
    }

    public static boolean gameOver(char[][] board) {
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[r].length; c++) {
                if (board[r][c] == '?') {
                    return false;
                }
            }
        }
        return true;
    }

    public static void play(char[][] board, char[] players) {
        int currentPlayer = 0;

        while (!gameOver(board)) {
            System.out.printf("Player %c's turn:\n", players[currentPlayer]);
            displayBoard(board);
            makeAMove(board, players[currentPlayer]);
            if (isWinner(board, players[currentPlayer])) {
                System.out.printf("Player %c wins!\n", players[currentPlayer]);
                return;
            }
            currentPlayer = switchPlayer(currentPlayer);
        }
        System.out.println("It's a tie!");
    }
}
