package application;

import chess.ChessMatch;
import chess.ChessPiece;

public class UI {
    private static void printBoard (ChessPiece[][] pieces) {
        for (int i = 0; i < pieces.length; i++) {
            System.out.println((8 - i) + " ");
            for (int j = 0; j < pieces.length; j++) {
            printPiece(pieces[i][j]);
            }
            System.out.println();
        }
        System.out.println("  a b c d e f g h");
    }

    private static void printPiece(ChessPiece) {
        if (piece == null) {
            System.out.println("-");
        } else {
            System.out.println(piece);
        }
        System.out.println(" ");
    }
}
