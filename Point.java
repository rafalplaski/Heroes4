package pl.sdk;

import java.util.Objects;

public class Point {
    final private int x;
    final private int y;

    public Point(int aX, int aY) {
        x = aX;
        y = aY;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x &&
                y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    int getX() {
        return x;
    }

    int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    double getDistanceToCenter() {
        return Math.sqrt(x * x + y * y);
    }
}