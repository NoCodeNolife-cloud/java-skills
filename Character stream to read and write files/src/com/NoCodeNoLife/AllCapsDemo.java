package com.NoCodeNoLife;

import java.io.*;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class AllCapsDemo {

    public static void main(String[] args) {
        AllCaps cap=new AllCaps(args[0]);
    }
}

class AllCaps {

    String sourceName;

    AllCaps(String sourceArg) {
        sourceName = sourceArg;
    }

    void convert() {
        try {
            FileSystem fs = FileSystems.getDefault();
            Path source = fs.getPath(sourceName);
            Path temp = fs.getPath("tmp_" + sourceName);

            // create input stream
            FileReader fr = new FileReader(source.toFile());
            BufferedReader in = new BufferedReader(fr);

            // create output stream
            FileWriter fw = new FileWriter(temp.toFile());
            BufferedWriter out = new BufferedWriter(fw);

            boolean eof = false;
            int inChar;
            do {
                inChar = in.read();
                if (inChar != -1) {
                    char outChar = Character.toUpperCase((char) inChar);
                    out.write(outChar);
                } else {
                    eof = true;
                }
            } while (!eof);

            in.close();
            out.close();

            Files.delete(source);
            Files.move(temp, source);

        } catch (IOException | SecurityException se) {
            System.out.println("Error -- " + se.toString());
        }
    }
}
