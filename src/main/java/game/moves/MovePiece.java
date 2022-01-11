package game.moves;

import game.base.BaseClass;
import game.board.ChessBoard;
import game.color.ColorBoard;
import game.color.LookPiece;
import game.figures.FreeBoard;

import static game.board.ChessBoard.*;

public class MovePiece {

    public static void move(String move) {
        // pe2–e4
        char namePiece = move.charAt(0);
        String from = move.substring(1, 3);
        String in = move.substring(4, 6);

//        System.out.println(namePiece);
//        System.out.println(from);
//        System.out.println(in);

        // Программа ищет объект на клетке e2 и изменяет его координаты на e4.

        // 1) Поиск поля e2
        // 2) Получить координаты x,y данного объекта
        // 3) Вытащить его из массива в переменную
        // 4) Закрасить это поле необходимым квадратом
        // 5) Поиск поля e4
        // 6) Записать объект из переменной в поле e4


        searchFromIn(from, in);
        ChessBoard.algebraicNotation();

    }

    private static void movePawn() {

    }

    private static void searchFromIn(String from, String in) {
        outer_1:
        for (int i = 0; i < arrBoardTest.length; i++) {
            for (int j = 0; j < arrBoardTest[0].length; j++) {

                if (arrBoardTest[i][j].algebraicNotation.equals(from)) {
                    outer_2:
                    for (int k = 0; k < arrBoardTest.length; k++) {
                        for (int m = 0; m < arrBoardTest[0].length; m++) {
                            if (arrBoardTest[k][m].algebraicNotation.equals(in)) {
                                arrBoardTest[k][m] = arrBoardTest[i][j].clone();
                                break outer_2;
                            }
                        }
                    }

                    if (arrBoardTest[i][j].colorBoard == ColorBoard.WHITE) {
                        arrBoardTest[i][j] = new FreeBoard(i, j, null, LookPiece.FreeBoardWhite.getLook(), false);
                        break outer_1;
                    } else if (arrBoardTest[i][j].colorBoard == ColorBoard.BLACK) {
                        arrBoardTest[i][j] = new FreeBoard(i, j, null, LookPiece.FreeBoardBlack.getLook(), false);
                        break outer_1;
                    }
                }
            }
        }
    }

}