package com.NoCodeNoLife;

import java.io.*;

/**
 * Data: Created in 2021/11/18
 * Description:
 */
public class PrimeReader {

    public static void main(String[] args) {
        try (
                DataInputStream data = new DataInputStream(new BufferedInputStream(new FileInputStream("400primes.dat")))
        ) {
            try {
                while (true) {
                    int in = data.readInt();
                    System.out.println(in + " ");
                }
            } catch (EOFException eof) {
                data.close();
            }
        } catch (IOException e) {
            System.out.println("Error -- " + e.toString());
        }
    }
}
