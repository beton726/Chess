package game.base;

import game.color.ColorBoard;
import game.color.ColorPiece;

abstract public class BaseClass implements Cloneable {
    public int x;
    public int y;
    public ColorPiece colorPiece; // цвет фигуры
    public ColorBoard colorBoard; // цвет доски
    public Character lookPiece; // как выглядит фигура
    public boolean flagPiece; // является ли фигура фигурой или пустое место
    public String algebraicNotation;

    public BaseClass(int x, int y, ColorPiece colorPiece, Character lookPiece, boolean flagPiece) {
        this.x = x;
        this.y = y;
        this.colorPiece = colorPiece;
        this.lookPiece = lookPiece;
        this.flagPiece = flagPiece;
        this.colorBoard = setColorBoard(x, y);
    }

    // Метод определяет цвет у ячейки.
    public ColorBoard setColorBoard(int x, int y) {
        if ((x % 2 == 0 && y % 2 == 0) || (x % 2 == 1 && y % 2 == 1)) {
            return ColorBoard.WHITE;
        } else {
            return ColorBoard.BLACK;
        }
    }



    public abstract Character getLookPiece();

    public abstract BaseClass clone();
}