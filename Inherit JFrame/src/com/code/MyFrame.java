package com.code;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    public MyFrame(String title){

        super(title);

        JLabel label=new JLabel("Hello Swing!");
        Container contentPane=getContentPane();

        contentPane.add(label);

        setSize(300,300);
        setVisible(true);
    }
}
