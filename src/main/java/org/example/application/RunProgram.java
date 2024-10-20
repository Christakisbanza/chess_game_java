package org.example.application;

import org.example.boardGame.Board;
import org.example.chess.ChessMatch;


public class RunProgram {
    public static void main(String[] args) {

        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());

    }
}
