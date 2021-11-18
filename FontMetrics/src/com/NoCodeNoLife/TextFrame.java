package com.NoCodeNoLife;

import javax.swing.*;

public class TextFrame extends JFrame {

    public TextFrame(String text, String fontName) {
        super("Show Font");
        setSize(425, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        TextFramePanle sf = new TextFramePanle(text, fontName);
        this.add(sf);
        setVisible(true);
    }

    public static void main(String[] args) {
        TextFrame tf = new TextFrame("What's the frequency, Kenneth?", "Arial Blcak");
    }
}
