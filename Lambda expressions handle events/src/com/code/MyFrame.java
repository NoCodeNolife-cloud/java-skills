package com.code;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JLabel label;

    public MyFrame(String title) {

        super(title);

        label = new JLabel("Label");

        getContentPane().add(label, BorderLayout.NORTH);

        JButton button1 = new JButton("Button1");
        getContentPane().add(button1, BorderLayout.CENTER);

        JButton button2 = new JButton("Button2");
        getContentPane().add(button2, BorderLayout.SOUTH);

        setSize(350, 120);
        setVisible(true);

        button2.addActionListener(this);
        button1.addActionListener((event) -> label.setText("Hello World!"));
    }

    public void actionPerformed(ActionEvent event) {

        label.setText("Hello Swing!");
    }
}

