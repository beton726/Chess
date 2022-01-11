package game.figures;

import game.base.BaseClass;
import game.color.ColorPiece;

public class Pawn extends BaseClass {
    public Pawn(int x, int y, ColorPiece colorPiece, Character lookPiece, boolean flagPiece) {
        super(x, y, colorPiece, lookPiece, flagPiece);
    }

    @Override
    public Character getLookPiece() {
        return lookPiece;
    }

    @Override
    public BaseClass clone() {
        return new Pawn(x, y, colorPiece, lookPiece, flagPiece);
    }
}