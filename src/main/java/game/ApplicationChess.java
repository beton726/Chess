package game;

import game.board.ChessBoard;
import game.moves.MovePiece;

public class ApplicationChess {

    public static void main(String[] args) {

        ChessBoard chessBoard = new ChessBoard();
        chessBoard.initAll();
        chessBoard.showBoard();

        MovePiece.move("pe2–e4");

        chessBoard.showBoard();

        MovePiece.move("pe4–e6");

        chessBoard.showBoard();

        MovePiece.move("pa1–a8");

        chessBoard.showBoard();

//        while (true) {
//            MovePiece.move("pe2–e4");
//
//
//
//        }


    }

}