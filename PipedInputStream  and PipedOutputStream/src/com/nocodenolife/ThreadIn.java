package com.nocodenolife;

import java.io.IOError;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class ThreadIn extends Thread {

    PipedInputStream pin;
    PipedOutputStream pout;

    int data;

    public ThreadIn(PipedInputStream in, PipedOutputStream out) {

        pin = in;
        pout = out;
    }

    public void run() {

        try {

            while ((data = pin.read()) != -1) {

                System.out.println(data);
            }
        } catch (IOException e) {

            e.printStackTrace();
        }
    }
}
