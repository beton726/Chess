package game.figures;

import game.base.AbstractChess;
import game.color.ColorPiece;

public class King extends AbstractChess {
    public King(String algebraicNotation, ColorPiece colorPiece, Character lookPiece, boolean flagPiece) {
        super(algebraicNotation, colorPiece, lookPiece, flagPiece);
    }

    @Override
    public AbstractChess clone() {
        return new King(this.getAlgebraicNotation(), this.getColorPiece(), this.getLookPiece(), this.isFlagPiece());
    }
}