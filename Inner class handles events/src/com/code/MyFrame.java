package com.code;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {

    JLabel label;

    public MyFrame(String title) {

        super(title);

        label = new JLabel("Label");

        JButton button1 = new JButton("Button1");

        JButton button2 = new JButton("Button2");

        getContentPane().add(label, BorderLayout.NORTH);

        getContentPane().add(button1, BorderLayout.CENTER);

        getContentPane().add(button2, BorderLayout.SOUTH);

        setSize(350, 120);

        setVisible(true);

        // action
        button2.addActionListener(new ActionEventHandler());

        button1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                label.setText("Hello Swing!");
            }
        });
    }

    class ActionEventHandler implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            label.setText("Hello World!");
        }
    }
}
