package game.base;

import game.color.ColorBoard;
import game.color.ColorPiece;

public abstract class AbstractChess {
    private String algebraicNotation; // алгебраическая нотация
    private ColorPiece colorPiece; // цвет фигуры
    private Character lookPiece; // как выглядит фигура
    private boolean flagPiece; // является ли фигура фигурой или пустое место
    private ColorBoard colorBoard; // на каком цвете стоит фигура

    public AbstractChess(String algebraicNotation, ColorPiece colorPiece, Character lookPiece, boolean flagPiece) {
        this.algebraicNotation = algebraicNotation;
        this.colorPiece = colorPiece;
        this.lookPiece = lookPiece;
        this.flagPiece = flagPiece;
    }

    public void setColorPiece(ColorPiece colorPiece) {
        this.colorPiece = colorPiece;
    }

    public void setColorBoard(ColorBoard colorBoard) {
        this.colorBoard = colorBoard;
    }

    public void setLookPiece(Character lookPiece) {
        this.lookPiece = lookPiece;
    }

    public void setFlagPiece(boolean flagPiece) {
        this.flagPiece = flagPiece;
    }

    public void setAlgebraicNotation(String algebraicNotation) {
        this.algebraicNotation = algebraicNotation;
    }

    public ColorPiece getColorPiece() {
        return colorPiece;
    }

    public ColorBoard getColorBoard() {
        return colorBoard;
    }

    public boolean isFlagPiece() {
        return flagPiece;
    }

    public String getAlgebraicNotation() {
        return algebraicNotation;
    }

    public Character getLookPiece() {
        return lookPiece;
    }

    public String toString() {
        return this.getClass().getName() + "{" +
                "colorPiece=" + getColorPiece() +
                ", colorBoard=" + getColorBoard() +
                ", lookPiece=" + getLookPiece() +
                ", flagPiece=" + isFlagPiece() +
                ", algebraicNotation=" + getAlgebraicNotation() +
                '}';
    }

    public abstract AbstractChess clone();
}