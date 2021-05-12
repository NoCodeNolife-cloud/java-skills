package com.code;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    private String s1[] = {"Java", "C++", "Objective-C"};

    public MyFrame(String title) {

        super(title);

        JLabel lblTextFieldLable = new JLabel("—°‘Òƒ„œ≤ª∂µƒ±‡≥Ã”Ô—‘£∫");
        getContentPane().add(lblTextFieldLable, BorderLayout.NORTH);

        JList<String> list1 = new JList<>(s1);
        list1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        list1.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                String itemString = list1.getSelectedValue();
                System.out.println(itemString);
            }
        });

        getContentPane().add(list1);

        setSize(300, 200);
        setVisible(true);
    }
}
