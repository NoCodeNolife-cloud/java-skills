package com.code;

import javax.swing.*;

public class MyFrame extends JFrame {

    public MyFrame(String title) {

        super(title);

        setResizable(false);
        getContentPane().setLayout(null);

        JLabel label = new JLabel("Label");
        label.setBounds(89, 13, 100, 30);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        getContentPane().add(label);

        JButton button1 = new JButton("Button1");
        button1.setBounds(89, 59, 100, 30);
        getContentPane().add(button1);

        JButton button2 = new JButton("Button2");
        button2.setLocation(89, 102);
        button2.setSize(100, 30);
        getContentPane().add(button2);

        setSize(300, 200);
        setVisible(true);

        button1.addActionListener((event) -> label.setText("Hello World!"));
        button2.addActionListener((event) -> label.setText("Hello Swing!"));
    }
}
