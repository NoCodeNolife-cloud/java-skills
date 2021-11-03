package com.NoCodeNoLife;

public class MPoint implements Comparable {

    private int x;
    private int y;

    public MPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Object o) {
        MPoint temp = (MPoint) o;
        if (this.x > temp.x) {
            return 1;
        } else if (this.x == temp.x) {
            if (this.y > temp.y) {
                return 1;
            } else if (this.y == temp.y) {
                return 0;
            } else {
                return -1;
            }
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "MPoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
