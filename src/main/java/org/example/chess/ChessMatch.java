package org.example.chess;

import org.example.boardGame.Board;
import org.example.boardGame.Position;
import org.example.chess.chessPieces.King;
import org.example.chess.chessPieces.Rook;

public class ChessMatch {
    private Board board;

    public ChessMatch(){
        board = new Board(8,8);
        initialSetUp();
    }

    public ChessPiece[][] getPieces(){
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        for (int i = 0; i < board.getRows(); i++) {
            for (int j = 0; j < board.getColumns(); j++) {
                mat[i][j] = (ChessPiece) board.piece(i,j);
            }
        }
        return mat;
    }

    private void initialSetUp(){
        board.placePiece(new Rook(board, Color.WHITE), new Position(2,1));
        board.placePiece(new King(board, Color.BLACK), new Position(0,4));
        board.placePiece(new King(board, Color.BLACK), new Position(7,4));
    }



}

