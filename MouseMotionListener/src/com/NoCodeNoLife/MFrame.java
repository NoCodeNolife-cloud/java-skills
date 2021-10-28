package com.NoCodeNoLife;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MFrame extends JFrame implements MouseMotionListener {

    private JLabel jLabel;

    public MFrame() {

        super("start");
        setSize(250, 75);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.CENTER));

        jLabel = new JLabel("executive");
        jLabel.addMouseMotionListener(this);

        add(jLabel);

        setVisible(true);
    }

    @Override
    public void mouseDragged(MouseEvent e) {

        Object obj = e.getSource();
        if (obj instanceof JLabel) {
            this.setTitle("mouseDragged");
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {

        Object obj = e.getSource();
        if (obj instanceof JLabel) {
            this.setTitle("mouseMoved");
        }
    }
}
