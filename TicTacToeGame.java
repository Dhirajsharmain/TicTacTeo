package bridgelabz;

import java.util.Scanner;

public class TicTacToeGame {
    public static char board[] = new char[10];
    public static char userLatter;
    public static char computerLatter;
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        createBoard();
        chooseLetter();
        System.out.println(userLatter);
        displayBoard();
    }

    /**
     * @see : Method For Choose One Letter X or O By User.
     */
    public static void chooseLetter() {
        System.out.print("Please Choose One Letter x OR o That You Want TO Go With : ");
        userLatter = scanner.next().charAt(0);
        if (userLatter == 'o') {
            System.out.println("You have chosen letter o that's way computer go with letter x");
            computerLatter = 'x';
        } else if (userLatter == 'x') {
            System.out.println("You chosen letter x that's way computer go with letter o");
            computerLatter = 'o';
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

    /**
     * @see : Method For Showing Board.
     */
    public static void displayBoard() {
        System.out.println("Updated Board : ");
        for (int i = 1; i < board.length; i++) {
            System.out.print(board[i] + " ");
            if (i == 3 || i == 6) {
                System.out.println();
            }
        }
        System.out.println();
    }

    /**
     * @see : method for  user to make a move to a desired location in the board.
     */
    private int moveUser() {
        System.out.print("Enter the index 1 to 9 that you want to move : ");
        int moveIndex = scanner.nextInt();
        return moveIndex;
    }
}


