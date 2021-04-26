package com.code;

import javax.sound.midi.SysexMessage;

public class Main {

    public static void main(String[] args) {
        int testScore=75;

        char grade;
        switch (testScore/10){
            case 9:
                grade='优';
                break;
            case 8:
                grade='良';
                break;
            case 7:
            case 6:
                grade='中';
                break;
            default:
                grade='差';
        }
        System.out.println("Grade = "+grade);
    }
}
