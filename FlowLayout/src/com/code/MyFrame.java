package com.code;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    private JLabel label;

    public MyFrame(String title) {

        // title
        super(title);

        // layout
        setLayout(new FlowLayout(FlowLayout.LEFT, 20, 20));

        // label
        label = new JLabel("Label");
        getContentPane().add(label);

        // button
        JButton button1 = new JButton("Button1");
        getContentPane().add(button1);

        JButton button2 = new JButton("Button2");
        getContentPane().add(button2);

        // set
        setSize(350, 120);
        setVisible(true);

        // register
        button1.addActionListener((event) -> label.setText("Hello Swing!"));
        button2.addActionListener((event) -> label.setText("Hello World!"));
    }
}
