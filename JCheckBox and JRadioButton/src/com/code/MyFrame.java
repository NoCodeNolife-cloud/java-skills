package com.code;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class MyFrame extends JFrame implements ItemListener {

    public MyFrame(String title) {

        // title
        super(title);

        // Layout
        getContentPane().setLayout(new BorderLayout());

        // panel
        JPanel panel1 = new JPanel();

        // FlowLayout
        FlowLayout flowLayout_1 = (FlowLayout) panel1.getLayout();
        flowLayout_1.setAlignment(FlowLayout.LEFT);
        getContentPane().add(panel1, BorderLayout.NORTH);

        // JLabel
        JLabel lblTextFieldLabel = new JLabel("选择你喜欢的编程语言：");
        panel1.add(lblTextFieldLabel);

        // JCheckBox one
        JCheckBox checkBox1 = new JCheckBox("Java");
        checkBox1.addActionListener((event) -> System.out.println((checkBox1.isSelected())));
        panel1.add(checkBox1);

        // JCheckBox two
        JCheckBox checkBox2 = new JCheckBox("C++");
        checkBox2.addActionListener((event) -> System.out.println((checkBox2.isSelected())));
        panel1.add(checkBox2);

        // JCheckBox three
        JCheckBox checkBox3 = new JCheckBox("Objective-C");
        checkBox3.addActionListener((event) -> System.out.println((checkBox3.isSelected())));
        panel1.add(checkBox3);

        // JPanel
        JPanel panel2 = new JPanel();

        // FlowLayout
        FlowLayout flowLayout = (FlowLayout) panel2.getLayout();
        flowLayout.setAlignment(FlowLayout.LEFT);
        getContentPane().add(panel2, BorderLayout.SOUTH);

        // JLabel
        JLabel lblTextAreaLabel = new JLabel("选择性别:");
        panel2.add(lblTextAreaLabel);

        // ButtonGroup
        ButtonGroup buttonGroup = new ButtonGroup();
        JRadioButton radioButton1 = new JRadioButton("男");
        buttonGroup.add(radioButton1);
        JRadioButton radioButton2 = new JRadioButton("女");
        buttonGroup.add(radioButton2);

        // add
        panel2.add(radioButton1);
        panel2.add(radioButton2);

        // radioButton
        radioButton1.addItemListener(this);
        radioButton2.addItemListener(this);

        // size
        pack();

        // visible
        setVisible(true);
    }

    public void itemStateChanged(ItemEvent e) {

        if (e.getStateChange() == ItemEvent.SELECTED) {

            JRadioButton button = (JRadioButton) e.getItem();
            System.out.println(button.getText());
        }
    }
}
