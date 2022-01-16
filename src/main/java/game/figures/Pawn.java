package game.figures;

import game.base.AbstractChess;
import game.color.ColorPiece;

public class Pawn extends AbstractChess {
    public Pawn(String algebraicNotation, ColorPiece colorPiece, Character lookPiece, boolean flagPiece) {
        super(algebraicNotation, colorPiece, lookPiece, flagPiece);
    }

    @Override
    public AbstractChess clone() {
        return new Pawn(this.getAlgebraicNotation(), this.getColorPiece(), this.getLookPiece(), this.isFlagPiece());
    }
}