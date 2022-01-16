package game.figures;

import game.base.AbstractChess;
import game.color.ColorPiece;

public class Bishop extends AbstractChess {
    public Bishop(String algebraicNotation, ColorPiece colorPiece, Character lookPiece, boolean flagPiece) {
        super(algebraicNotation, colorPiece, lookPiece, flagPiece);
    }

    @Override
    public AbstractChess clone() {
        return new Bishop(this.getAlgebraicNotation(), this.getColorPiece(), this.getLookPiece(), this.isFlagPiece());
    }
}