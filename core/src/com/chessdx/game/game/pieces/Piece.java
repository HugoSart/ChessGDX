package com.chessdx.game.game.pieces;

/**
 * User: hugo_<br/>
 * Date: 24/12/2017<br/>
 * Time: 01:29<br/>
 */
public class Piece {

    private Color color;
    private MovementType[] availableMovements;

    public Piece(Color color, MovementType[] availableMovements) {
        this.color = color;
        this.availableMovements = availableMovements;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public MovementType[] getAvailableMovements() {
        return availableMovements;
    }

    public void setAvailableMovements(MovementType[] availableMovements) {
        this.availableMovements = availableMovements;
    }

    public boolean checkColor(Color color) {
        return this.color.equals(color);
    }

    public boolean checkMovement(MovementType movementType) {
        for (MovementType availableMovement : availableMovements)
            if (availableMovement.equals(movementType))
                return true;
        return false;
    }

    public enum Color {
        WHITE, BLACK
    }

    public enum MovementType {
        ALL_UP, ALL_DOWN, ALL_LEFT, ALL_RIGHT,
        ALL_DIAGONAL_UP_RIGHT, ALL_DIAGONAL_UP_LEFT, ALL_DIAGONAL_DOWN_RIGHT, ALL_DIAGONAL_DOWN_LEFT ,
        ALL_L,
        ONE_UP, TWO_UP, ONE_DIAGONAL_UP_RIGHT, ONE_DIAGONAL_UP_LEFT,
        ONE_DOWN, TWO_DOWN, ONE_DIAGONAL_DOWN_RIGHT, ONE_DIAGONAL_DOWN_LEFT,
        ONE_RIGHT, ONE_LEFT
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "<color=" + getColor() + ">";
    }
}
