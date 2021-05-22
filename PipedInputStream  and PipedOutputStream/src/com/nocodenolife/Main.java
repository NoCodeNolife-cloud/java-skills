package com.nocodenolife;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class Main {

    public static void main(String[] args) {

        PipedInputStream mypin = null;
        PipedOutputStream mypout = null;

        try {

            mypin = new PipedInputStream();
            mypout = new PipedOutputStream();

            mypin.connect(mypout);

            ThreadOut tout = new ThreadOut(mypin, mypout);
            ThreadIn tin = new ThreadIn(mypin, mypout);

            tout.start();
            tin.start();
        } catch (IOException e) {

            e.printStackTrace();
        }
    }
}
