package com.chessdx.game.game.pieces;

import com.chessdx.game.game.pieces.Piece;

/**
 * User: hugo_<br/>
 * Date: 24/12/2017<br/>
 * Time: 02:02<br/>
 */
public class King extends Piece {

    King(Piece.Color color) {
        super(color, new Piece.MovementType[]{MovementType.ONE_UP, MovementType.ONE_DOWN, MovementType.ONE_LEFT, MovementType.ONE_RIGHT,
                MovementType.ONE_DIAGONAL_DOWN_RIGHT, MovementType.ONE_DIAGONAL_DOWN_LEFT, MovementType.ONE_DIAGONAL_UP_LEFT, MovementType.ONE_DIAGONAL_UP_RIGHT});
    }

}
