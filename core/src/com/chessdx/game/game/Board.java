package com.chessdx.game.game;

import com.chessdx.game.game.pieces.Piece;
import com.chessdx.game.game.pieces.PieceFactory;
import com.chessdx.game.game.pieces.Rook;

/**
 * User: hugo_<br/>
 * Date: 24/12/2017<br/>
 * Time: 01:55<br/>
 */
public class Board {

    public static int HEIGHT = 8, WIDTH = 8;

    private Position[][] board;

    public Board() {
        board = new Position[HEIGHT][WIDTH];
        setUpBoard();
    }

    public Position get(int i, int j) {
        return board[i][j];
    }

    public void print() {
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++)
                System.out.print(board[i][j] + " ");
            System.out.println();
        }
    }

    private void setUpBoard() {

        board[0][0] = new Position(PieceFactory.create(PieceFactory.KnownPieces.ROOK, Piece.Color.WHITE));
        board[0][1] = new Position(PieceFactory.create(PieceFactory.KnownPieces.KNIGHT, Piece.Color.WHITE));
        board[0][2] = new Position(PieceFactory.create(PieceFactory.KnownPieces.BISHOP, Piece.Color.WHITE));
        board[0][3] = new Position(PieceFactory.create(PieceFactory.KnownPieces.QUEEN, Piece.Color.WHITE));
        board[0][4] = new Position(PieceFactory.create(PieceFactory.KnownPieces.KING, Piece.Color.WHITE));
        board[0][5] = new Position(PieceFactory.create(PieceFactory.KnownPieces.BISHOP, Piece.Color.WHITE));
        board[0][6] = new Position(PieceFactory.create(PieceFactory.KnownPieces.KNIGHT, Piece.Color.WHITE));
        board[0][7] = new Position(PieceFactory.create(PieceFactory.KnownPieces.ROOK, Piece.Color.WHITE));
        for (int i = 0; i < 8; i++)
            board[1][i] = new Position(PieceFactory.create(PieceFactory.KnownPieces.PAWN, Piece.Color.WHITE));

        for (int i = 2; i < 6; i++)
            for (int j = 0; j < 8; j++)
                board[i][j] = new Position(null);

        for (int i = 0; i < 8; i++)
            board[6][i] = new Position(PieceFactory.create(PieceFactory.KnownPieces.PAWN, Piece.Color.BLACK));
        board[7][0] = new Position(PieceFactory.create(PieceFactory.KnownPieces.ROOK, Piece.Color.BLACK));
        board[7][1] = new Position(PieceFactory.create(PieceFactory.KnownPieces.KNIGHT, Piece.Color.BLACK));
        board[7][2] = new Position(PieceFactory.create(PieceFactory.KnownPieces.BISHOP, Piece.Color.BLACK));
        board[7][3] = new Position(PieceFactory.create(PieceFactory.KnownPieces.QUEEN, Piece.Color.BLACK));
        board[7][4] = new Position(PieceFactory.create(PieceFactory.KnownPieces.KING, Piece.Color.BLACK));
        board[7][5] = new Position(PieceFactory.create(PieceFactory.KnownPieces.BISHOP, Piece.Color.BLACK));
        board[7][6] = new Position(PieceFactory.create(PieceFactory.KnownPieces.KNIGHT, Piece.Color.BLACK));
        board[7][7] = new Position(PieceFactory.create(PieceFactory.KnownPieces.ROOK, Piece.Color.BLACK));

    }

}
