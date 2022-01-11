package game.figures;

import game.base.BaseClass;
import game.color.ColorPiece;

public class Queen extends BaseClass {
    public Queen(int x, int y, ColorPiece colorPiece, Character lookPiece, boolean flagPiece) {
        super(x, y, colorPiece, lookPiece, flagPiece);
    }

    @Override
    public Character getLookPiece() {
        return lookPiece;
    }

    @Override
    public BaseClass clone() {
        return new Queen(x, y, colorPiece, lookPiece, flagPiece);
    }
}