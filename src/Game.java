import Piece.PieceContainer;
import Player.Player;

public class Game {

    private int pieceSet = 6;
    Player[] player = new Player[2];
    PieceContainer pieceContainer;

    public Game() {

    }

    public void start() {
        pieceContainer = new PieceContainer(pieceSet + 1 * (pieceSet + 2) / 2, pieceSet);
    }

    public int getPieceSet() {
        return pieceSet;
    }
}
