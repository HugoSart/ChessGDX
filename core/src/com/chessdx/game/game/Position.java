package com.chessdx.game.game;

import com.chessdx.game.game.pieces.Piece;

/**
 * User: hugo_<br/>
 * Date: 24/12/2017<br/>
 * Time: 02:04<br/>
 */
public class Position {

    private Piece piece = null;

    public Position(Piece piece) {
        this.piece = piece;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "<" + piece + ">";
    }
}
