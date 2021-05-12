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
        table.setFont(new Font("微软雅黑", Font.PLAIN, 16));
        table.getTableHeader().setFont(new Font("微软雅黑", Font.BOLD, 16));
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
                    System.out.println("没有选中行");
                } else {
                    int selectionRow = lsm.getMinSelectionIndex();
                    System.out.println("第" + selectionRow + "行被选中");
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

    String colunmNames[] = {"书籍编号", "书籍名称", "作者", "出版社", "出版日期", "库存数量"};
    Object[][] rowData = {{"0036", "高等数学", "李放", "人民邮电出版社", "20000812", 1},
            {"0004", "FLASH精选", "刘扬", "中国纺织出版社", "19990312", 2},
            {"0026", "软件工程", "牛田", "经济科学出版社", "20000328", 4}};
}
