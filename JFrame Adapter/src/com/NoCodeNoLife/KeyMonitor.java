package com.NoCodeNoLife;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyMonitor extends KeyAdapter {

    KeyChecker display;

    KeyMonitor(KeyChecker display) {

        this.display = display;
    }

    public void keyTyped(KeyEvent event) {

        display.keyLabel.setText(" " + event.getKeyChar());
        display.repaint();
    }
}
