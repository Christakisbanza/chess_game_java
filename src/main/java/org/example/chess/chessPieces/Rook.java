package org.example.chess.chessPieces;

import org.example.boardGame.Board;
import org.example.chess.ChessPiece;
import org.example.chess.Color;

public class Rook extends ChessPiece {

    public Rook(Board board, Color color){
        super(board, color);
    }

    @Override
    public String toString(){
        return "R";
    }

}
