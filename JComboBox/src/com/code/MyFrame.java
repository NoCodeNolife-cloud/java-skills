package com.code;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.util.Arrays;

public class MyFrame extends JFrame {

    private JComboBox choice1;
    private JComboBox choice2;

    private String[] s1 = {"Java", "C++", "Objective-C"};
    private String[] s2 = {"��", "Ů"};

    public MyFrame(String title) {

        super(title);

        getContentPane().setLayout(new GridLayout(2, 2, 0, 0));
        JLabel lblTextFieldLabel = new JLabel("ѡ����ϲ���ı������:");
        lblTextFieldLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(lblTextFieldLabel);

        choice1 = new JComboBox<String>(s1);
        choice1.addActionListener(e->{

            JComboBox<String>cb=(JComboBox<String>) e.getSource();
            String itemString=(String)cb.getSelectedItem();
            System.out.println(itemString);
        });
        getContentPane().add(choice1);

        JLabel lblTextAreaLabel=new JLabel("ѡ���Ա�:");
        lblTextAreaLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(lblTextAreaLabel);

        choice2=new JComboBox<String>(s2);
        choice2.addItemListener(e->{

            if(e.getStateChange()==ItemEvent.SELECTED){

                String itemString =(String)e.getItem();
                System.out.println(itemString);
            }
        });
        getContentPane().add(choice2);

        setSize(400, 150);

        setVisible(true);
    }
}
