package game.moves;

import game.board.ChessBoard;
import game.color.ColorBoard;
import game.color.LookPiece;
import game.figures.FreeBoard;

public class MovePiece {

    public void move(ChessBoard chessBoard, String move) {
        String from = move.substring(1, 3);
        String in = move.substring(4, 6);
        switch (move.charAt(0)) {
            case 'K' :
                break;
            case 'Q' :
                break;
            case 'R' :
                break;
            case 'B' :
                break;
            case 'N' :
                break;
            case 'p' :
                movePawn(chessBoard, from, in);


                break;
        }



        searchFromIn(chessBoard, from, in);
        chessBoard.algebraicNotationAndPaintEmptySquares();
    }

    private void movePawn(ChessBoard chessBoard, String from, String in) {



    }

    private void searchFromIn(ChessBoard chessBoard, String from, String in) {
        outer_1:
        for (int i = 0; i < chessBoard.getArrBoard().length; i++) {
            for (int j = 0; j < chessBoard.getArrBoard()[0].length; j++) {

                if (chessBoard.getArrBoard()[i][j].algebraicNotation.equals(from)) {
                    outer_2:
                    for (int k = 0; k < chessBoard.getArrBoard().length; k++) {
                        for (int m = 0; m < chessBoard.getArrBoard()[0].length; m++) {
                            if (chessBoard.getArrBoard()[k][m].algebraicNotation.equals(in)) {
                                chessBoard.getArrBoard()[k][m] = chessBoard.getArrBoard()[i][j].clone();
                                break outer_2;
                            }
                        }
                    }

                    if (chessBoard.getArrBoard()[i][j].colorBoard == ColorBoard.WHITE) {
                        chessBoard.getArrBoard()[i][j] = new FreeBoard(i, j, null, LookPiece.FreeBoardWhite.getLook(), false);
                        break outer_1;
                    } else if (chessBoard.getArrBoard()[i][j].colorBoard == ColorBoard.BLACK) {
                        chessBoard.getArrBoard()[i][j] = new FreeBoard(i, j, null, LookPiece.FreeBoardBlack.getLook(), false);
                        break outer_1;
                    }
                }
            }
        }
    }

}