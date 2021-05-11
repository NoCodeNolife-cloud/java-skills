package com.code;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    private JTextField textField;
    private JPasswordField passwordField;

    public MyFrame(String title) {

        super(title);

        getContentPane().setLayout(new BorderLayout());

        JPanel panel1 = new JPanel();
        getContentPane().add(panel1, BorderLayout.NORTH);

        JLabel lblTextFieldLabel = new JLabel("TextField:");
        panel1.add(lblTextFieldLabel);

        textField = new JTextField(12);
        panel1.add(textField);

        JLabel lblPasswordLabel = new JLabel("Password:");
        panel1.add(lblPasswordLabel);

        passwordField = new JPasswordField(12);
        panel1.add(passwordField);

        JPanel panel2 = new JPanel();
        getContentPane().add(panel2, BorderLayout.SOUTH);

        JLabel lblTextAreaLabel = new JLabel("TextArea");
        panel2.add(lblTextAreaLabel);

        JTextArea textArea = new JTextArea(2, 30);
        panel2.add(textArea);

        pack();

        setVisible(true);

        textField.addActionListener((event) -> textArea.setText("在文本框上按下Enter键"));
    }
}
