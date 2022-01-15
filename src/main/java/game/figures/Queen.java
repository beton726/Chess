package game.figures;

import game.base.AbstractChess;
import game.color.ColorPiece;

public class Queen extends AbstractChess {
    public Queen(int x, int y, ColorPiece colorPiece, Character lookPiece, boolean flagPiece) {
        super(x, y, colorPiece, lookPiece, flagPiece);
    }

    @Override
    public Character getLookPiece() {
        return lookPiece;
    }

    @Override
    public AbstractChess clone() {
        return new Queen(x, y, colorPiece, lookPiece, flagPiece);
    }
}