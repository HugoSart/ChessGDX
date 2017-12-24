package com.chessdx.game.graphic;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.chessdx.game.game.pieces.*;

/**
 * User: hugo_<br/>
 * Date: 24/12/2017<br/>
 * Time: 02:41<br/>
 */
public class Textures {

    public static Texture MOUSE_HOVER_TEXTURE = new Texture("mouse-hover.png");

    public static Texture WHITE_ROOK_TEXTURE = new Texture("white-rook.png");
    public static Texture WHITE_KNIGHT_TEXTURE = new Texture("white-knight.png");
    public static Texture WHITE_BISHOP_TEXTURE = new Texture("white-bishop.png");
    public static Texture WHITE_QUEEN_TEXTURE = new Texture("white-queen.png");
    public static Texture WHITE_KING_TEXTURE = new Texture("white-king.png");
    public static Texture WHITE_PAWN_TEXTURE = new Texture("white-pawn.png");

    public static Texture BLACK_ROOK_TEXTURE = new Texture("black-rook.png");
    public static Texture BLACK_KNIGHT_TEXTURE = new Texture("black-knight.png");
    public static Texture BLACK_BISHOP_TEXTURE = new Texture("black-bishop.png");
    public static Texture BLACK_QUEEN_TEXTURE = new Texture("black-queen.png");
    public static Texture BLACK_KING_TEXTURE = new Texture("black-king.png");
    public static Texture BLACK_PAWN_TEXTURE = new Texture("black-pawn.png");

    public static Texture getPieceTexture(PieceFactory.KnownPieces piece, Piece.Color color) {

        switch (piece) {
            case ROOK   : return color.equals(Piece.Color.WHITE) ? WHITE_ROOK_TEXTURE   : BLACK_ROOK_TEXTURE;
            case KNIGHT : return color.equals(Piece.Color.WHITE) ? WHITE_KNIGHT_TEXTURE : BLACK_KNIGHT_TEXTURE;
            case BISHOP : return color.equals(Piece.Color.WHITE) ? WHITE_BISHOP_TEXTURE : BLACK_BISHOP_TEXTURE;
            case QUEEN  : return color.equals(Piece.Color.WHITE) ? WHITE_QUEEN_TEXTURE  : BLACK_QUEEN_TEXTURE;
            case KING   : return color.equals(Piece.Color.WHITE) ? WHITE_KING_TEXTURE   : BLACK_KING_TEXTURE;
            case PAWN   : return color.equals(Piece.Color.WHITE) ? WHITE_PAWN_TEXTURE   : BLACK_PAWN_TEXTURE;
        }

        return null;

    }

    public static Texture getPieceTexture(Class<? extends Piece> clazz, Piece.Color color) {

        if (clazz.equals(Rook.class))   return color.equals(Piece.Color.WHITE) ? WHITE_ROOK_TEXTURE   : BLACK_ROOK_TEXTURE;
        if (clazz.equals(Knight.class)) return color.equals(Piece.Color.WHITE) ? WHITE_KNIGHT_TEXTURE : BLACK_KNIGHT_TEXTURE;
        if (clazz.equals(Bishop.class)) return color.equals(Piece.Color.WHITE) ? WHITE_BISHOP_TEXTURE : BLACK_BISHOP_TEXTURE;
        if (clazz.equals(Queen.class))  return color.equals(Piece.Color.WHITE) ? WHITE_QUEEN_TEXTURE  : BLACK_QUEEN_TEXTURE;
        if (clazz.equals(King.class))   return color.equals(Piece.Color.WHITE) ? WHITE_KING_TEXTURE   : BLACK_KING_TEXTURE;
        if (clazz.equals(Pawn.class))   return color.equals(Piece.Color.WHITE) ? WHITE_PAWN_TEXTURE   : BLACK_PAWN_TEXTURE;

        return null;

    }

}
