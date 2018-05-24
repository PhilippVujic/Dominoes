package Piece;

public class Piece {
    private int value1;
    private int value2;

    enum Orientation {horizontal, vertical}
    enum OrientationSide {ltr, rtl}

    private Orientation orientation = Orientation.horizontal;
    private OrientationSide orientationSide = OrientationSide.ltr;

    public Piece(int value1, int value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public int getValue1() {
        return value1;
    }

    public int getValue2() {
        return value2;
    }

    public Orientation getOrientation() {
        return orientation;
    }

    public void setOrientation(Orientation orientation) {
        this.orientation = orientation;
    }

    @Override
    public String toString() {
        if (orientation == orientation.horizontal && orientationSide == orientationSide.ltr) {
            return "[" + value1 + "|" + value2 + ']';
        } else if (orientation == orientation.horizontal && orientationSide == orientationSide.rtl) {
            return "[" + value2 + "|" + value1 + ']';
        } else {
            try {
                throw new Exception("Not supported yet");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
