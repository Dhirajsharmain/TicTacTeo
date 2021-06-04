package bridgelabz;

public class TicTacToeGame {
    public static char board[] = new char[10];

    public static void main(String[] args) {

        createBoard();
    }

    /**
     * @see : Method For Creating Board with Empty Space
     */
    public static void createBoard() {
        for (int i = 1; i < board.length; i++) {
                board[i] = '-';
            }
        }
    }

}
