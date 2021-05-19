package com.noCodeNOLife;

public class PaintedPoint extends ColoredPoint implements Paintable {

    int finish;

    public void setFinish(int finish) {

        this.finish = finish;
    }

    public int getFinish() {

        return finish;
    }
}
