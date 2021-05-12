package com.code;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class MyFrameTable extends JFrame {

    private double screenWidth = Toolkit.getDefaultToolkit().getScreenSize().getWidth();
    private double screenHeight = Toolkit.getDefaultToolkit().getScreenSize().getHeight();

    private JTable table;

    public MyFrameTable(String title) {

        super(title);

        table = new JTable(rowData, colunmNames);
        table.setFont(new Font("΢���ź�", Font.PLAIN, 16));
        table.getTableHeader().setFont(new Font("΢���ź�", Font.BOLD, 16));
        table.setRowHeight(40);
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        ListSelectionModel rowSM = table.getSelectionModel();
        rowSM.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    return;
                }
                ListSelectionModel lsm = (ListSelectionModel) e.getSource();
                if (lsm.isSelectionEmpty()) {
                    System.out.println("û��ѡ����");
                } else {
                    int selectionRow = lsm.getMinSelectionIndex();
                    System.out.println("��" + selectionRow + "�б�ѡ��");
                }
            }
        });

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setViewportView(table);
        getContentPane().add(scrollPane, BorderLayout.CENTER);

        setSize(960, 640);
        int x = (int) (screenWidth - 960) / 2;
        int y = (int) (screenHeight - 640) / 2;

        setLocation(x, y);
        setVisible(true);
    }

    String colunmNames[] = {"�鼮���", "�鼮����", "����", "������", "��������", "�������"};
    Object[][] rowData = {{"0036", "�ߵ���ѧ", "���", "�����ʵ������", "20000812", 1},
            {"0004", "FLASH��ѡ", "����", "�й���֯������", "19990312", 2},
            {"0026", "�������", "ţ��", "���ÿ�ѧ������", "20000328", 4}};
}
