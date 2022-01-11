package game.figures;

import game.base.BaseClass;
import game.color.ColorPiece;

public class Bishop extends BaseClass {
    public Bishop(int x, int y, ColorPiece colorPiece, Character lookPiece, boolean flagPiece) {
        super(x, y, colorPiece, lookPiece, flagPiece);
    }

    @Override
    public Character getLookPiece() {
        return lookPiece;
    }

    @Override
    public BaseClass clone() {
        return new Bishop(x, y, colorPiece, lookPiece, flagPiece);
    }
}