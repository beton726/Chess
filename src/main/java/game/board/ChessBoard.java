package game.board;

import game.base.BaseClass;
import game.color.ColorPiece;
import game.color.LookPiece;
import game.figures.*;

import java.util.ArrayList;
import java.util.List;

public class ChessBoard {
    static final int x = 8;
    static final int y = 8;

    public static String[] alphabet = new String[]{"a","b","c","d","e","f","g","h"};
    List<BaseClass> whitePieceList = new ArrayList<>();
    List<BaseClass> blackPieceList = new ArrayList<>();
    List<BaseClass> freeBoardList = new ArrayList<>();

    public static BaseClass[][] arrBoardTest = new BaseClass[x][y];

    private void initWhitePiece() {
        // Инициализация основных фигур.
        whitePieceList.add(new Rook(0, 0, ColorPiece.WHITE, LookPiece.RookWhite.getLook(), true));
        whitePieceList.add(new Knight(0, 1, ColorPiece.WHITE, LookPiece.KnightWhite.getLook(), true));
        whitePieceList.add(new Bishop(0, 2, ColorPiece.WHITE, LookPiece.BishopWhite.getLook(), true));
        whitePieceList.add(new Bishop(0, 3, ColorPiece.WHITE, LookPiece.QueenWhite.getLook(), true));
        whitePieceList.add(new Bishop(0, 4, ColorPiece.WHITE, LookPiece.KingWhite.getLook(), true));
        whitePieceList.add(new Bishop(0, 5, ColorPiece.WHITE, LookPiece.BishopWhite.getLook(), true));
        whitePieceList.add(new Knight(0, 6, ColorPiece.WHITE, LookPiece.KnightWhite.getLook(), true));
        whitePieceList.add(new Rook(0, 7, ColorPiece.WHITE, LookPiece.RookWhite.getLook(), true));
        // Инициализация пешек.
        whitePieceList.add(new Pawn(1, 0, ColorPiece.WHITE, LookPiece.PawnWhite.getLook(), true));
        whitePieceList.add(new Pawn(1, 1, ColorPiece.WHITE, LookPiece.PawnWhite.getLook(), true));
        whitePieceList.add(new Pawn(1, 2, ColorPiece.WHITE, LookPiece.PawnWhite.getLook(), true));
        whitePieceList.add(new Pawn(1, 3, ColorPiece.WHITE, LookPiece.PawnWhite.getLook(), true));
        whitePieceList.add(new Pawn(1, 4, ColorPiece.WHITE, LookPiece.PawnWhite.getLook(), true));
        whitePieceList.add(new Pawn(1, 5, ColorPiece.WHITE, LookPiece.PawnWhite.getLook(), true));
        whitePieceList.add(new Pawn(1, 6, ColorPiece.WHITE, LookPiece.PawnWhite.getLook(), true));
        whitePieceList.add(new Pawn(1, 7, ColorPiece.WHITE, LookPiece.PawnWhite.getLook(), true));
    }

    private void initBlackPiece() {
        // Инициализация основных фигур.
        blackPieceList.add(new Rook(7, 0, ColorPiece.BLACK, LookPiece.RookBlack.getLook(), true));
        blackPieceList.add(new Knight(7, 1, ColorPiece.BLACK, LookPiece.KnightBlack.getLook(), true));
        blackPieceList.add(new Bishop(7, 2, ColorPiece.BLACK, LookPiece.BishopBlack.getLook(), true));
        blackPieceList.add(new Bishop(7, 3, ColorPiece.BLACK, LookPiece.QueenBlack.getLook(), true));
        blackPieceList.add(new Bishop(7, 4, ColorPiece.BLACK, LookPiece.KingBlack.getLook(), true));
        blackPieceList.add(new Bishop(7, 5, ColorPiece.BLACK, LookPiece.BishopBlack.getLook(), true));
        blackPieceList.add(new Knight(7, 6, ColorPiece.BLACK, LookPiece.KnightBlack.getLook(), true));
        blackPieceList.add(new Rook(7, 7, ColorPiece.BLACK, LookPiece.RookBlack.getLook(), true));
        // Инициализация пешек.
        blackPieceList.add(new Pawn(6, 0, ColorPiece.BLACK, LookPiece.PawnBlack.getLook(), true));
        blackPieceList.add(new Pawn(6, 1, ColorPiece.BLACK, LookPiece.PawnBlack.getLook(), true));
        blackPieceList.add(new Pawn(6, 2, ColorPiece.BLACK, LookPiece.PawnBlack.getLook(), true));
        blackPieceList.add(new Pawn(6, 3, ColorPiece.BLACK, LookPiece.PawnBlack.getLook(), true));
        blackPieceList.add(new Pawn(6, 4, ColorPiece.BLACK, LookPiece.PawnBlack.getLook(), true));
        blackPieceList.add(new Pawn(6, 5, ColorPiece.BLACK, LookPiece.PawnBlack.getLook(), true));
        blackPieceList.add(new Pawn(6, 6, ColorPiece.BLACK, LookPiece.PawnBlack.getLook(), true));
        blackPieceList.add(new Pawn(6, 7, ColorPiece.BLACK, LookPiece.PawnBlack.getLook(), true));
    }

    private void initFreeBoard() {
        // x с 2 по 5
        // y с 0 по 7
        for (int i = 2; i <= 5; i++) {
            for (int j = 0; j <= 7; j++) {
                if ((i % 2 == 0 && j % 2 == 0) || (i % 2 == 1 && j % 2 == 1))
                    freeBoardList.add(new FreeBoard(i, j, null, LookPiece.FreeBoardWhite.getLook(), false));
                else
                    freeBoardList.add(new FreeBoard(i, j, null, LookPiece.FreeBoardBlack.getLook(), false));
            }
        }
    }

    public void initAll() {
        initWhitePiece();
        initBlackPiece();
        initFreeBoard();

        for (BaseClass obj : whitePieceList) {
            arrBoardTest[obj.x][obj.y] = obj;
        }
        for (BaseClass obj : blackPieceList) {
            arrBoardTest[obj.x][obj.y] = obj;
        }
        for (BaseClass obj : freeBoardList) {
            arrBoardTest[obj.x][obj.y] = obj;
        }
        // Привязать алгебраическую нотацию
        algebraicNotation();
    }

    public static void showBoard() {
        System.out.println("-------------");
        for (int i = 0; i < arrBoardTest.length; i++) {
            for (int j = 0; j < arrBoardTest[0].length; j++) {
                System.out.print(arrBoardTest[i][j].getLookPiece() + " ");
            }
            System.out.println();
        }
        System.out.println("-------------");
//        for (int i = 0; i < arrBoardTest.length; i++) {
//            for (int j = 0; j < arrBoardTest[0].length; j++) {
//                System.out.print(arrBoardTest[i][j].algebraicNotation + " ");
//            }
//            System.out.println();
//        }
    }

    public static void algebraicNotation() {
        for (int i = 0; i < arrBoardTest.length; i++) {
            for (int j = 0; j < arrBoardTest[0].length; j++) {
                arrBoardTest[i][j].algebraicNotation = alphabet[j] + (x - i);
            }
        }
    }

}