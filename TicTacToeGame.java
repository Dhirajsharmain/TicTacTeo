package bridgelabz;

import java.util.Scanner;

public class TicTacToeGame {
    public static char board[] = new char[10];
    public static char userLatter;

    public static void main(String[] args) {

        createBoard();
        chooseLetter();
        System.out.println(userLatter);
    }

    /**
     * @see : Method For Choose One Letter X or O By User.
     */
    private static void chooseLetter() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Choose One Letter X OR O That You Want TO Go With : ");
        userLatter = scanner.next().charAt(0);
        if (userLatter == 'o') {
            System.out.println("You have chosen letter O that's way computer go with letter X");
        } else if (userLatter == 'x') {
            System.out.println("You chosen letter X that's way computer go with letter O");
        } else {
            System.out.println("Please enter correct input");
        }
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


