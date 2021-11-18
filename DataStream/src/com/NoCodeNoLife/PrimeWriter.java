package com.NoCodeNoLife;

import java.io.*;

public class PrimeWriter {

    public static void main(String[] args) {
        int[] primes = new int[400];
        int numPrimes = 0;
        // candidate: the number that might be prime
        int candidate = 2;
        while (numPrimes < 400) {
            if (isPrime(candidate)) {
                primes[numPrimes] = candidate;
                numPrimes++;
            }
            candidate++;
        }

        try (
                //write output to disk
                DataOutputStream data = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("400primes.dat")))
        ) {
            for (int i = 0; i < 400; i++) {
                data.writeInt(primes[i]);
            }
            data.close();
        } catch (IOException e) {
            System.out.println("Error -- " + e.toString());
        }
    }

    public static boolean isPrime(int checkNumber) {
        double root = Math.sqrt(checkNumber);
        for (int i = 2; i <= root; i++) {
            if (checkNumber % i == 0) {
                return false;
            }
        }
        return true;
    }
}
