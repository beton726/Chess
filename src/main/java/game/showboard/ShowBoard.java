package game.showboard;

import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.Arrays;

public class ShowBoard {
    Logger log = Logger.getLogger(ShowBoard.class);

//    public static void showBoard(String[][] arrBoard) {
//        Arrays.stream(arrBoard).forEach(arrs -> System.out.println(Arrays.toString(arrs)));
//    }

    @Test
    public void testShow() {
        int x = 8;
        int y = 8;

//        int[][] arrBoardTest = new int[x][y];
//
//        for (int i = 0; i < arrBoardTest.length; i++) {
//            for (int j = 0; j < arrBoardTest[0].length; j++) {
//                if ((i % 2 == 0 && j % 2 == 0) || (i % 2 == 1 && j % 2 == 1)) {
//                    arrBoardTest[i][j] = 0;
//                } else {
//                    arrBoardTest[i][j] = 1;
//                }
//            }
//            System.out.println(Arrays.toString(arrBoardTest[i]));
//        }


        String[][] arrBoardTestString = new String[x][y];
        String[] alphabet = new String[]{"a","b","c","d","e","f","g","h"};
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