package com.NoCodeNoLife;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton jButton1;
    JButton jButton2;

    public MyFrame() {
        super("initialized");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(450, 150);
        GridLayout gridLayout = new GridLayout(1, 2);
        setLayout(gridLayout);
        setResizable(false);
        jButton1 = new JButton("action1");
        jButton2 = new JButton("action2");
        jButton1.addActionListener(this);
        jButton2.addActionListener(this);
        add(jButton1);
        add(jButton2);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object target = e.getSource();
        if (target == jButton1) {
            setTitle("action1");
        } else if (target == jButton2) {
            setTitle("action2");
        }
    }
}
