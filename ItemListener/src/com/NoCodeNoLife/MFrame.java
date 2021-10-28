package com.NoCodeNoLife;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class MFrame extends JFrame implements ItemListener {

    static String[] strTitle = {"Normal mode", "Zen mode", "Quiet mode", "Fast mode", "Slow mode"};
    JComboBox jComboBox;
    JCheckBox jCheckBox;

    public MFrame() {

        super(strTitle[0]);
        setSize(300, 100);
        setResizable(false);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        String[] contents = {"Normal", "Zen", "Quiet", "Fast", "Slow"};
        jComboBox = new JComboBox(contents);
        jComboBox.setSelectedIndex(0);
        jComboBox.addItemListener(this);

        jCheckBox = new JCheckBox("confirm");
        jCheckBox.addItemListener(this);

        add(jCheckBox, BorderLayout.SOUTH);
        add(jComboBox, BorderLayout.CENTER);

        setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {

        if (jCheckBox.isSelected()) {
            int selectIndex = jComboBox.getSelectedIndex();
            this.setTitle(strTitle[selectIndex]);
        }
    }
}
