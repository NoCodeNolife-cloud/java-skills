package com.code;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    public MyFrame(String title) {

        super(title);

        setLayout(new BorderLayout(10, 10));

        getContentPane().add(new Button("北"), BorderLayout.NORTH);
        getContentPane().add(new Button("南"), BorderLayout.SOUTH);
        getContentPane().add(new Button("东"), BorderLayout.EAST);
        getContentPane().add(new Button("西"), BorderLayout.WEST);
        getContentPane().add(new Button("中"), BorderLayout.CENTER);

        setSize(300, 300);
        setVisible(true);
    }
}
