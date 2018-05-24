package Piece;

public class Piece {
    private int value1;
    private int value2;
    enum Orientation {horizontal, vertical};
    private Orientation orientation = Orientation.horizontal;

    public Piece(int value1, int value2) {
        this.value1 = value1;
        this.value2 = value2;
     }

    public int getValue1() {
        return value1;
    }

    public void setValue1(int value1) {
        this.value1 = value1;
    }

    public int getValue2() {
        return value2;
    }

    public void setValue2(int value2) {
        this.value2 = value2;
    }

    public Orientation getOrientation() {
        return orientation;
    }

    public void setOrientation(Orientation orientation) {
        this.orientation = orientation;
    }
}
