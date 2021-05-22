package com.nocodenolife;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Vector;

public class FileWritter {

    private DataOutputStream dataOutputStream;

    public FileWritter(File file) {

        try {

            FileOutputStream fileOutputStream = new FileOutputStream(file);
            dataOutputStream = new DataOutputStream(fileOutputStream);
        } catch (IOException ignored) {
        }
    }

    public void writeFile(Vector<Integer> vector) {

        try {

            for (Integer integer : vector) {

                dataOutputStream.writeInt(integer);
            }
            dataOutputStream.close();
        } catch (IOException ignored) {
        }

    }
}
