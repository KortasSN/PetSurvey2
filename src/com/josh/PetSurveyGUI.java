package com.josh;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Created by kortasthekiller on 4/24/16.
 */
public class PetSurveyGUI  extends JFrame {
    private JPanel rootPanel;
    private JCheckBox dogCheckBox;
    private JCheckBox catCheckBox;
    private JCheckBox fishCheckBox;
    private JButton submitButton;
    private JLabel surveyResultsLabel;
    private boolean hasDogs;
    private boolean hasCats;
    private boolean hasFish;







    protected PetSurveyGUI () {
        super("Pet Survey");
        setContentPane(rootPanel);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);


        dogCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                hasDogs = dogCheckBox.isSelected();

            }
        });
        catCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                hasCats = catCheckBox.isSelected();

            }
        });
        fishCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                hasFish = fishCheckBox.isSelected();
            }
        });
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String dog = (hasDogs) ? "one dog" : "no dogs";
                String cat = (hasCats) ? "one cat" : "no cats";
                String fish = (hasFish) ? "one fish" : "no fish";
                            }
        });
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String dog = (hasDogs) ? "a dog" : "no dogs";
                String cat = (hasCats) ? "a cat" : "no cats";
                String fish = (hasFish) ? "a fish" : "no fish";

                String surveyResults = "User has " + dog + "and " + cat + " and " + fish;
                surveyResultsLabel.setText(surveyResults);
            }
        });
    }
}
