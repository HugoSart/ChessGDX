package com.chessdx.game.game.pieces;

import com.chessdx.game.game.pieces.Piece;

/**
 * User: hugo_<br/>
 * Date: 24/12/2017<br/>
 * Time: 01:33<br/>
 */
public class Rook extends Piece {

    Rook(Color color) {
        super(color, new MovementType[]{MovementType.ALL_UP, MovementType.ALL_DOWN, MovementType.ALL_RIGHT, MovementType.ALL_LEFT});
    }

}
