package com.NoCodeNoLife;

import javax.swing.*;

public class SurveyFrame extends JFrame {
    public SurveyFrame() {
        super("Survey");
        setSize(290, 140);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        SurveyWizard wiz = new SurveyWizard();
        add(wiz);
        setVisible(true);
    }
}
