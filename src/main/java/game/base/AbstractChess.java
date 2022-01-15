package game.base;

import game.color.ColorBoard;
import game.color.ColorPiece;

public abstract class AbstractChess {
    // Нужны ли фигуре координаты.
    public int x;
    public int y;
    public ColorPiece colorPiece; // цвет фигуры
    public ColorBoard colorBoard; // на каком цвете стоит фигура
    public Character lookPiece; // как выглядит фигура
    public boolean flagPiece; // является ли фигура фигурой или пустое место
    public String algebraicNotation;

    public AbstractChess(int x, int y, ColorPiece colorPiece, Character lookPiece, boolean flagPiece) {
        this.x = x;
        this.y = y;
        this.colorPiece = colorPiece;
        this.lookPiece = lookPiece;
        this.flagPiece = flagPiece;
    }

    public abstract Character getLookPiece();

    public abstract AbstractChess clone();
}