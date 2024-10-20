package org.example.chess;

import org.example.boardGame.Board;
import org.example.boardGame.Piece;

public class ChessPiece extends Piece {
    private Color color;

    public ChessPiece(Board board, Color color){
        super(board);
        this.color = color;
    }

    public Color getColor(){
        return color;
    }


}
