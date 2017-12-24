package com.chessdx.game.game.pieces;

import com.chessdx.game.game.pieces.Piece;

/**
 * User: hugo_<br/>
 * Date: 24/12/2017<br/>
 * Time: 02:01<br/>
 */
public class Queen extends Piece{

    Queen(Piece.Color color) {
        super(color, new Piece.MovementType[]{MovementType.ALL_DIAGONAL_UP_RIGHT, MovementType.ALL_DIAGONAL_UP_LEFT,
                MovementType.ONE_DIAGONAL_DOWN_RIGHT, MovementType.ONE_DIAGONAL_DOWN_LEFT,
                MovementType.ALL_UP, MovementType.ALL_DOWN, MovementType.ALL_RIGHT, MovementType.ALL_LEFT});
    }

}
