package Piece;

public class PieceContainer {

    int quantityPieces;
    Piece[] pieces;
    int pieceSet;

    public PieceContainer(int quantityPieces, int pieceSet) {
        this.quantityPieces = quantityPieces;
        pieces = new Piece[quantityPieces];
        this.pieceSet = pieceSet;

        createPieces(pieceSet);
    }

    private void createPieces(int pieceSet) {
        for (int i = 0; i < pieceSet + 1; i++) {

        }
    }
}
