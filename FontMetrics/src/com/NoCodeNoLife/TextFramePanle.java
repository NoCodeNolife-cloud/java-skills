package com.NoCodeNoLife;

import javax.swing.*;
import java.awt.*;

/**
 * Data: Created in 2021/11/17
 * Description:
 */
public class TextFramePanle extends JPanel {

    String text;
    String fontName;

    public TextFramePanle(String text, String fontName) {
        super();
        this.text = text;
        this.fontName = fontName;
    }

    public void paintComponent(Graphics comp) {
        super.paintComponents(comp);
        Graphics2D comp2D = (Graphics2D) comp;
        comp2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        Font font = new Font(fontName, Font.BOLD, 18);
        FontMetrics metrics = getFontMetrics(font);
        int x = (getSize().width - metrics.stringWidth(text)) / 2;
        int y = getSize().height / 2;
        comp2D.drawString(text, x, y);
    }
}
