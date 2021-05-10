package com.code;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Container;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("MyFrame");
        JLabel label = new JLabel("Hello Swing!");
        Container contentPane = frame.getContentPane();

        contentPane.add(label);
        frame.setSize(150, 300);
        frame.setVisible(true);
    }
}
