package com.code;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    public MyFrame(String title) {

        super(title);

        setLayout(new BorderLayout(10, 10));

        getContentPane().add(new Button("��"), BorderLayout.NORTH);
        getContentPane().add(new Button("��"), BorderLayout.SOUTH);
        getContentPane().add(new Button("��"), BorderLayout.EAST);
        getContentPane().add(new Button("��"), BorderLayout.WEST);
        getContentPane().add(new Button("��"), BorderLayout.CENTER);

        setSize(300, 300);
        setVisible(true);
    }
}
