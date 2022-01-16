package game.figures;

import game.base.AbstractChess;
import game.color.ColorPiece;

public class Rook extends AbstractChess {
    public Rook(String algebraicNotation, ColorPiece colorPiece, Character lookPiece, boolean flagPiece) {
        super(algebraicNotation, colorPiece, lookPiece, flagPiece);
    }

    @Override
    public AbstractChess clone() {
        return new Rook(this.getAlgebraicNotation(), this.getColorPiece(), this.getLookPiece(), this.isFlagPiece());
    }
}