package Piece;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PieceContainer {

    int quantityPieces;
    Piece piece;
    int pieceSet;
    List<Piece> allPieces = new ArrayList<>();

    public PieceContainer(int quantityPieces, int pieceSet) {
        this.quantityPieces = quantityPieces;
        this.pieceSet = pieceSet;

        createPieces(pieceSet);
    }

    private void createPieces(int pieceSet) {
        int cont = 0;
        for (int i = 0; i < pieceSet + 1; i++) {
            for (int j = i; j < pieceSet + 1; j++, cont++) {
                allPieces.add(new Piece(i, j));
            }
        }
        Collections.shuffle(allPieces);
    }
}
