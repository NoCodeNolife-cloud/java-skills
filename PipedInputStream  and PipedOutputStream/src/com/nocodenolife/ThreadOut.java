package com.nocodenolife;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class ThreadOut extends Thread {

    PipedInputStream pin;
    PipedOutputStream pout;

    byte data[] = {1, 2, 3};

    public ThreadOut(PipedInputStream in, PipedOutputStream out) {

        pin = in;
        pout = out;
    }

    public void run() {

        try {

            pout.write(data);
        } catch (IOException e) {

            e.printStackTrace();
        }
    }
}
