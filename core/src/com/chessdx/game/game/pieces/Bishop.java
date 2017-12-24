package com.chessdx.game.game.pieces;

import com.chessdx.game.game.pieces.Piece;

/**
 * User: hugo_<br/>
 * Date: 24/12/2017<br/>
 * Time: 02:00<br/>
 */
public class Bishop extends Piece {

    Bishop(Color color) {
        super(color, new MovementType[]{MovementType.ALL_DIAGONAL_UP_RIGHT, MovementType.ALL_DIAGONAL_UP_LEFT,
                MovementType.ONE_DIAGONAL_DOWN_RIGHT, MovementType.ONE_DIAGONAL_DOWN_LEFT});
    }

}
