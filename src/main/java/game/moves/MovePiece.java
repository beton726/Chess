package game.moves;

import game.base.AbstractChess;
import game.board.ChessBoard;
import game.color.ColorBoard;
import game.color.LookPiece;
import game.figures.FreeBoard;

public class MovePiece {

    public void move(ChessBoard chessBoard, String move) {
        String from = move.substring(1, 3);
        String in = move.substring(4, 6);
        switch (move.charAt(0)) {
            case 'K':
                break;
            case 'Q':
                break;
            case 'R':
                break;
            case 'B':
                break;
            case 'N':
                break;
            case 'p':
                movePawn(chessBoard, from, in);


                break;
        }


        searchFromIn(chessBoard, from, in);
        chessBoard.algebraicNotationAndPaintEmptySquares();
    }

    private void moveCalculation(ChessBoard chessBoard) {


    }

    private void movePawn(ChessBoard chessBoard, String from, String in) {

    }

    private void searchFromIn(ChessBoard chessBoard, String from, String in) {

        AbstractChess[][] arrBoard = chessBoard.getArrBoard();

//        for (AbstractChess[] row : arrBoard) {
//            for (AbstractChess element : row) {
//
//                if(element.getAlgebraicNotation().equals(from)) {
//
//
//                    for (AbstractChess[] row_in : arrBoard) {
//                        for (AbstractChess element_in : row_in) {
//
//                            if(element_in.getAlgebraicNotation().equals(in)) {
//
//
//
//                                element_in.clone();
//                            }
//
//                        }
//                    }
//
//
//                }
//
//            }
//        }


        outer_1:
        for (int i = 0; i < arrBoard.length; i++) {
            for (int j = 0; j < arrBoard[0].length; j++) {

                if (arrBoard[i][j].getAlgebraicNotation().equals(from)) {
                    outer_2:
                    for (int k = 0; k < arrBoard.length; k++) {
                        for (int m = 0; m < arrBoard[0].length; m++) {
                            if (arrBoard[k][m].getAlgebraicNotation().equals(in)) {
                                arrBoard[k][m] = arrBoard[i][j].clone();
                                break outer_2;
                            }
                        }
                    }

                    if (arrBoard[i][j].getColorBoard() == ColorBoard.WHITE) {
                        arrBoard[i][j] = new FreeBoard("",null, LookPiece.FreeBoardWhite.getLook(),false);
                        break outer_1;
                    } else if (arrBoard[i][j].getColorBoard() == ColorBoard.BLACK) {
                        arrBoard[i][j] = new FreeBoard("",null, LookPiece.FreeBoardBlack.getLook(),false);
                        break outer_1;
                    }
                }
            }
        }
    }

}