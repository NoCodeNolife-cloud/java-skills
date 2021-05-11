package com.code;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    public MyFrame(String title) {

        super(title);

        setLayout(new GridLayout(3, 3));

        getContentPane().add(new Button("1"));
        getContentPane().add(new Button("2"));
        getContentPane().add(new Button("3"));
        getContentPane().add(new Button("4"));
        getContentPane().add(new Button("5"));
        getContentPane().add(new Button("6"));
        getContentPane().add(new Button("7"));
        getContentPane().add(new Button("8"));
        getContentPane().add(new Button("9"));

        setSize(400, 400);
        setVisible(true);
    }
}
