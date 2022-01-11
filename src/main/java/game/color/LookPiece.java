package game.color;

/*
 * Символ фигуры при выводе в консоль.
 * */
public enum LookPiece {
    KingWhite('\u265A'),
    QueenWhite('\u265B'),
    BishopWhite('\u265D'),
    KnightWhite('\u265E'),
    RookWhite('\u265C'),
    PawnWhite('\u265F'),
    FreeBoardWhite('\u25A0'),

    KingBlack('\u2654'),
    QueenBlack('\u2655'),
    BishopBlack('\u2657'),
    KnightBlack('\u2658'),
    RookBlack('\u2656'),
    PawnBlack('\u2659'),
    FreeBoardBlack('\u25A1');

    private final char look;

    LookPiece(char look) {
        this.look = look;
    }

    public char getLook() {
        return look;
    }

}