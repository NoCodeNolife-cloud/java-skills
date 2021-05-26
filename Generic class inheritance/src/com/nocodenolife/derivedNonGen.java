package com.nocodenolife;

public class derivedNonGen<T> extends noneGen {

    T Dob;

    public derivedNonGen(int ob, T dob) {

        super(ob);
        Dob = dob;
    }

    public T getDob() {

        return Dob;
    }
}
