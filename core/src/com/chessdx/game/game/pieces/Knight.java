package com.chessdx.game.game.pieces;

import com.chessdx.game.game.pieces.Piece;

/**
 * User: hugo_<br/>
 * Date: 24/12/2017<br/>
 * Time: 01:59<br/>
 */
public class Knight extends Piece {

    Knight(Piece.Color color) {
        super(color, new Piece.MovementType[]{MovementType.ALL_L});
    }

}
