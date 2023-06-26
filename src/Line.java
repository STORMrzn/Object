import java.util.Objects;

class Line implements Cloneable{
    Point start,end;
    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public Line clone() throws CloneNotSupportedException {
        Line l=new Line(start,end);
        return l;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Line line = (Line) o;
        return Objects.equals(start, line.start) && Objects.equals(end, line.end);
    }

    @Override
    public int hashCode() {
        return Objects.hash(start, end);
    }

    }
