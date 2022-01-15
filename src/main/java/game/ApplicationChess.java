package game;

import game.board.ChessBoard;
import game.helper.ConsoleHelper;
import game.moves.MovePiece;

public class ApplicationChess {

    public static void main(String[] args) {

        ChessBoard chessBoard = new ChessBoard();
        chessBoard.initAll();

        ConsoleHelper.showBoard(chessBoard);

        MovePiece movePiece = new MovePiece();
        movePiece.move(chessBoard, "pe2–e4");

        ConsoleHelper.showBoard(chessBoard);


//        chessBoard.showBoard();
//
//        movePiece.move(chessBoard, "pe4–e2");
//
//        chessBoard.showBoard();
//
//        movePiece.move(chessBoard, "pe2–e4");
//        movePiece.move(chessBoard, "pe4–e2");
//        movePiece.move(chessBoard, "pe2–e4");
//
//        movePiece.move(chessBoard, "pe4–e3");
//
//        chessBoard.showBoard();

//        movePiece.move(chessBoard, "pe4–e6");
//
//        chessBoard.showBoard();
//
//        movePiece.move(chessBoard, "pc8–b4");
//
//        chessBoard.showBoard();

//        while (true) {
//            MovePiece.move("pe2–e4");
//
//
//
//        }


    }

}