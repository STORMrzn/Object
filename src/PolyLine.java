import java.util.Arrays;

class PolyLine {
    Point[] points;

    public PolyLine(Point... points) {
        this.points = points;
    };

    public PolyLine(PolyLine pl) {
        this.points=pl.points;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PolyLine polyLine = (PolyLine) o;
        return Arrays.equals(points, polyLine.points);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(points);
    }
}
