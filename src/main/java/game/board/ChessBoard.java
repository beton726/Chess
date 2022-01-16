package game.board;

import game.base.AbstractChess;
import game.color.ColorBoard;
import game.color.ColorPiece;
import game.color.LookPiece;
import game.figures.*;

import java.util.ArrayList;
import java.util.List;

public class ChessBoard {
    private final int x = 8;
    private final int y = 8;
    private final String[] alphabet = new String[]{"a", "b", "c", "d", "e", "f", "g", "h"};

    private final AbstractChess[][] arrBoard = new AbstractChess[x][y];

    List<AbstractChess> allPiece = new ArrayList<>();

    private void initAllPiece() {
        // Белые фигуры
        allPiece.add(new Rook("a1", ColorPiece.WHITE, LookPiece.RookWhite.getLook(), true));
        allPiece.add(new Knight("b1", ColorPiece.WHITE, LookPiece.KnightWhite.getLook(), true));
        allPiece.add(new Bishop("c1", ColorPiece.WHITE, LookPiece.BishopWhite.getLook(), true));
        allPiece.add(new Bishop("d1", ColorPiece.WHITE, LookPiece.QueenWhite.getLook(), true));
        allPiece.add(new Bishop("e1", ColorPiece.WHITE, LookPiece.KingWhite.getLook(), true));
        allPiece.add(new Bishop("f1", ColorPiece.WHITE, LookPiece.BishopWhite.getLook(), true));
        allPiece.add(new Knight("g1", ColorPiece.WHITE, LookPiece.KnightWhite.getLook(), true));
        allPiece.add(new Rook("h1", ColorPiece.WHITE, LookPiece.RookWhite.getLook(), true));
        allPiece.add(new Pawn("a2", ColorPiece.WHITE, LookPiece.PawnWhite.getLook(), true));
        allPiece.add(new Pawn("b2", ColorPiece.WHITE, LookPiece.PawnWhite.getLook(), true));
        allPiece.add(new Pawn("c2", ColorPiece.WHITE, LookPiece.PawnWhite.getLook(), true));
        allPiece.add(new Pawn("d2", ColorPiece.WHITE, LookPiece.PawnWhite.getLook(), true));
        allPiece.add(new Pawn("e2", ColorPiece.WHITE, LookPiece.PawnWhite.getLook(), true));
        allPiece.add(new Pawn("f2", ColorPiece.WHITE, LookPiece.PawnWhite.getLook(), true));
        allPiece.add(new Pawn("g2", ColorPiece.WHITE, LookPiece.PawnWhite.getLook(), true));
        allPiece.add(new Pawn("h2", ColorPiece.WHITE, LookPiece.PawnWhite.getLook(), true));
        // Чёрные фигуры
        allPiece.add(new Rook("a8", ColorPiece.BLACK, LookPiece.RookBlack.getLook(), true));
        allPiece.add(new Knight("b8", ColorPiece.BLACK, LookPiece.KnightBlack.getLook(), true));
        allPiece.add(new Bishop("c8", ColorPiece.BLACK, LookPiece.BishopBlack.getLook(), true));
        allPiece.add(new Bishop("d8", ColorPiece.BLACK, LookPiece.QueenBlack.getLook(), true));
        allPiece.add(new Bishop("e8", ColorPiece.BLACK, LookPiece.KingBlack.getLook(), true));
        allPiece.add(new Bishop("f8", ColorPiece.BLACK, LookPiece.BishopBlack.getLook(), true));
        allPiece.add(new Knight("g8", ColorPiece.BLACK, LookPiece.KnightBlack.getLook(), true));
        allPiece.add(new Rook("h8", ColorPiece.BLACK, LookPiece.RookBlack.getLook(), true));
        allPiece.add(new Pawn("a7", ColorPiece.BLACK, LookPiece.PawnBlack.getLook(), true));
        allPiece.add(new Pawn("b7", ColorPiece.BLACK, LookPiece.PawnBlack.getLook(), true));
        allPiece.add(new Pawn("c7", ColorPiece.BLACK, LookPiece.PawnBlack.getLook(), true));
        allPiece.add(new Pawn("d7", ColorPiece.BLACK, LookPiece.PawnBlack.getLook(), true));
        allPiece.add(new Pawn("e7", ColorPiece.BLACK, LookPiece.PawnBlack.getLook(), true));
        allPiece.add(new Pawn("f7", ColorPiece.BLACK, LookPiece.PawnBlack.getLook(), true));
        allPiece.add(new Pawn("g7", ColorPiece.BLACK, LookPiece.PawnBlack.getLook(), true));
        allPiece.add(new Pawn("h7", ColorPiece.BLACK, LookPiece.PawnBlack.getLook(), true));
    }

    public void initAll() {
        initAllPiece();

        // 1) Создаём клетки на поле
        createCageOnBoard();
        // 2) Закрашиваем клетки
        algebraicNotationAndPaintEmptySquares();
        // 3) Выставляем фигуры на доску
        setPieceOnBoard(allPiece);
    }

    // Создаём клетки на поле
    private void createCageOnBoard() {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if ((i % 2 == 0 && j % 2 == 0) || (i % 2 == 1 && j % 2 == 1)) {
                    arrBoard[i][j] = new FreeBoard(alphabet[j] + (x - i), null, LookPiece.FreeBoardWhite.getLook(), false);
                    arrBoard[i][j].setColorBoard(ColorBoard.WHITE);
                } else {
                    arrBoard[i][j] = new FreeBoard(alphabet[j] + (x - i), null, LookPiece.FreeBoardBlack.getLook(), false);
                    arrBoard[i][j].setColorBoard(ColorBoard.BLACK);
                }
            }
        }
    }

    // Устанавливаем фигуры на доску
    private void setPieceOnBoard(List<AbstractChess> bwList) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                String algNotBoard = arrBoard[i][j].getAlgebraicNotation();
                for (AbstractChess algNotPiece : bwList) {
                    if (algNotBoard.equals(algNotPiece.getAlgebraicNotation())) {
                        arrBoard[i][j] = algNotPiece;
                    }
                }
            }
        }
    }

    public void algebraicNotationAndPaintEmptySquares() {
        for (int i = 0; i < arrBoard.length; i++) {
            for (int j = 0; j < arrBoard[0].length; j++) {
                arrBoard[i][j].setAlgebraicNotation(alphabet[j] + (x - i));
                if ((i % 2 == 0 && j % 2 == 0) || (i % 2 == 1 && j % 2 == 1))
                    arrBoard[i][j].setColorBoard(ColorBoard.WHITE);
                else
                    arrBoard[i][j].setColorBoard(ColorBoard.BLACK);
            }
        }
    }

    public AbstractChess[][] getArrBoard() {
        return arrBoard;
    }

    public String[] getAlphabet() {
        return alphabet;
    }

}