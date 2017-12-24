package com.chessdx.game.game.pieces;

/**
 * User: hugo_<br/>
 * Date: 24/12/2017<br/>
 * Time: 02:11<br/>
 */
public class PieceFactory {

    private PieceFactory() {}

    public static Piece create(KnownPieces knownPieces, Piece.Color color) {

        Piece piece = null;

        switch (knownPieces) {
            case PAWN: piece = new Pawn(color); break;
            case ROOK: piece = new Rook(color); break;
            case KNIGHT: piece = new Knight(color); break;
            case BISHOP: piece = new Bishop(color); break;
            case QUEEN: piece = new Queen(color); break;
            case KING: piece = new King(color); break;
        }

        return piece;

    }

    public enum KnownPieces {
        PAWN, ROOK, KNIGHT, BISHOP, QUEEN, KING;
    }

}
