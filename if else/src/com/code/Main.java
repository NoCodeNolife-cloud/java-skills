package com.code;

public class Main {

    public static void main(String[] args) {
        int testScore = 76;
        if (testScore >= 90) {
            System.out.println("Grade = A");
        } else if (testScore >= 80) {
            System.out.println("Grade = B");
        } else if (testScore >= 70) {
            System.out.println("Grade = C");
        } else if (testScore >= 60) {
            System.out.println("Grade = D");
        } else {
            System.out.println("Grade = F");
        }
    }
}
