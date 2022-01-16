package game.figures;

import game.base.AbstractChess;
import game.color.ColorPiece;

public class FreeBoard extends AbstractChess {
    public FreeBoard(String algebraicNotation, ColorPiece colorPiece, Character lookPiece, boolean flagPiece) {
        super(algebraicNotation, colorPiece, lookPiece, flagPiece);
    }

    @Override
    public AbstractChess clone() {
        return new FreeBoard(this.getAlgebraicNotation(), this.getColorPiece(), this.getLookPiece(), this.isFlagPiece());
    }
}