package com.NoCodeNoLife;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

/**
 * calculator JFrame
 */
public class Calculator extends JFrame implements FocusListener {

    JTextField jTextField1;
    JTextField jTextField2;
    JTextField jTextField3;
    JLabel jLabel1;
    JLabel jLabel2;

    /**
     * constructor
     */
    public Calculator() {
        super("Add Two Numbers");
        setSize(350, 90);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.CENTER));

        jTextField1 = new JTextField("0.0", 5);
        jLabel1 = new JLabel("+");
        jTextField2 = new JTextField("0.0", 5);
        jLabel2 = new JLabel("=");
        jTextField3 = new JTextField("0.0", 5);
        jTextField3.setEditable(false);

        jTextField1.addFocusListener(this);
        jTextField2.addFocusListener(this);

        add(jTextField1);
        add(jLabel1);
        add(jTextField2);
        add(jLabel2);
        add(jTextField3);

        setVisible(true);
    }

    @Override
    public void focusGained(FocusEvent e) {

        try {
            Float res = Float.parseFloat(jTextField1.getText()) + Float.parseFloat(jTextField2.getText());
            jTextField3.setText(String.valueOf(res));
        } catch (NumberFormatException err) {
            jTextField1.setText("0");
            jTextField2.setText("0");
        }
    }

    @Override
    public void focusLost(FocusEvent e) {

        focusGained(e);
    }
}
