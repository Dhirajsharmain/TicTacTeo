package bridgelabz;

public class TicTacToeGame {
    public static char board[][] = new char[3][3];

    public static void main(String[] args) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = '-';

            }
        }
    }


}
