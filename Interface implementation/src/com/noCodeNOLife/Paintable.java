package com.noCodeNOLife;

public interface Paintable extends Colorable {

    int MATTE = 0, GLOSSY = 1;

    void setFinish(int finish);

    int getFinish();
}
