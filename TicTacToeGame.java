package bridgelabz;

public class TicTacToeGame {
    public static char board[][] = new char[3][3];

    public static void main(String[] args) {

        board();
    }

    // Method For Creating Board with Empty Space
    public static void board(){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = '-';

            }
        }
    }

}
