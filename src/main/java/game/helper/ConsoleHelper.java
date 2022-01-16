package game.helper;

import game.base.AbstractChess;
import game.board.ChessBoard;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.Arrays;

public class ConsoleHelper {

    private static final Logger log = Logger.getLogger(ConsoleHelper.class);
    private static final String line = "-------------";

    public static void showBoard(ChessBoard chessBoard) {
        AbstractChess[][] arrBoard = chessBoard.getArrBoard();
        showLookPiece(arrBoard);
    }

    public static void showBoard(AbstractChess[][] arrBoard) {
        showLookPiece(arrBoard);
    }

    private static void showLookPiece(AbstractChess[][] arrBoard) {
        for (AbstractChess[] chess : arrBoard) {
            for (int j = 0; j < arrBoard[0].length; j++) {
                System.out.print(chess[j].getLookPiece() + " ");
            }
            System.out.println();
        }
        System.out.println(ConsoleHelper.line);
    }

    public static void showAlgebraicNotation(ChessBoard chessBoard) {
        AbstractChess[][] arrBoard = chessBoard.getArrBoard();
        showAlgNot(arrBoard);
    }

    public static void showAlgebraicNotation(AbstractChess[][] arrBoard) {
        showAlgNot(arrBoard);
    }

    private static void showAlgNot(AbstractChess[][] arrBoard) {
        for (AbstractChess[] chess : arrBoard) {
            for (int j = 0; j < arrBoard[0].length; j++) {
                System.out.print(chess[j].getAlgebraicNotation() + " ");
            }
            System.out.println();
        }
        System.out.println(ConsoleHelper.line);
    }

    @Test
    public void testShow() {
        int x = 8;
        int y = 8;

        String[][] arrBoardTestString = new String[x][y];
        String[] alphabet = new String[]{"a", "b", "c", "d", "e", "f", "g", "h"};
        for (int i = 0; i < arrBoardTestString.length; i++) {
            for (int j = 0; j < arrBoardTestString[0].length; j++) {
                arrBoardTestString[i][j] = alphabet[j] + (x - i);
            }
            System.out.println(Arrays.toString(arrBoardTestString[i]));
        }
    }

    @Test
    public void showChessPiece() {
        log.info("\nWhite pieces: " +
                "\nKing\t\u265A" +
                "\nQueen\t\u265B" +
                "\nBishop\t\u265D" +
                "\nKnight\t\u265E" +
                "\nRook\t\u265C" +
                "\nPawn\t\u265F" +
                "\nBlack pieces: " +
                "\nKing\t\u2654" +
                "\nQueen\t\u2655" +
                "\nBishop\t\u2657" +
                "\nKnight\t\u2658" +
                "\nRook\t\u2655" +
                "\nPawn\t\u2659" +
                "\nWhite field:\t\u25A0" +
                "\nBlack field:\t\u25A1"
        );
        log.info("\u259E");
    }

}