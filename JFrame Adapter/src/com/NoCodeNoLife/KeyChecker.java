package com.NoCodeNoLife;

import javax.swing.*;
import java.awt.*;

public class KeyChecker extends JFrame {

    JLabel keyLabel = new JLabel("Hit any key");

    public KeyChecker() {

        super("Hit a key");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        KeyMonitor monitor = new KeyMonitor(this);
        setFocusable(true);
        addKeyListener(monitor);
        add(keyLabel);
        setVisible(true);
    }
}
