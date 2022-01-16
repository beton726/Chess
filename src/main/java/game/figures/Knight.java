package game.figures;

import game.base.AbstractChess;
import game.color.ColorPiece;

public class Knight extends AbstractChess {
    public Knight(String algebraicNotation, ColorPiece colorPiece, Character lookPiece, boolean flagPiece) {
        super(algebraicNotation, colorPiece, lookPiece, flagPiece);
    }

    @Override
    public AbstractChess clone() {
        return new Knight(this.getAlgebraicNotation(), this.getColorPiece(), this.getLookPiece(), this.isFlagPiece());
    }
}