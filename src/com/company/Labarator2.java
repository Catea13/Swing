package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Labarator2 {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }

    private static void createAndShowGUI() {
        int ionValue = 50;
        int alexValue = 100;
        int bankValue = 100;
        JFrame frame = new JFrame("Text Fields Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(600, 400));

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
//            constraints.gridx = 0;
//            constraints.gridy = 0;
        //  constraints.insets = new Insets(10, 10, 10, 10);

        JTextField textField1 = new JTextField();
        JTextField textField2 = new JTextField("Initial Text");
        JTextField textField3 = new JTextField("Initial text with width", 20);

        textField1.setColumns(20);
        textField2.setColumns(20);
        textField3.setColumns(20);
        JLabel ion = new JLabel();
        ion.setText("Ion are" + ionValue + "$");
        panel.add(ion);
        // constraints.gridy++;
        // panel.add(new JLabel("Ion are"+ ionValue +"$"));
        // constraints.gridy++;
        //panel.add(textField1);


        //  constraints.gridy++;
        JLabel alex = new JLabel();
        alex.setText("Alex are" + alexValue + "$");
        panel.add(alex);

        panel.add(textField2);

        //  constraints.gridy++;
        JLabel banc = new JLabel();
        banc.setText("In banca sunt" + bankValue + "$");
        panel.add(banc);
        constraints.gridy++;
        panel.add(textField3);
        frame.setContentPane(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        JButton b = new JButton("Da 10 $ lui Ion");//creating instance of JButton
        b.setBounds(180, 100, 200, 40);
        panel.add(b);

        JButton b1 = new JButton("Primeste 5$ de la Alex");//creating instance of JButton
        b1.setBounds(180, 100, 200, 40);
        panel.add(b1);
      b1.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
              if(alexValue>5||alexValue==5){
                  int value=ionValue+5;
                  ion.setText("Ion are"+value+"$");
              }
              else if(alexValue<5){
                  b1.setText("Nu am suficient bani");
              }
          }
      });
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (bankValue > 10 || bankValue == 10) {

                    int value = ionValue + 10;
                    System.out.println(value);


                    ion.setText(("Ion are" + value + "$"));
                    int NewbankValue = bankValue - 10;
                    banc.setText("In banca sunt" + NewbankValue + "$");

                } else if (bankValue < 10) {
                    b.setText("Banc nu are bani");


                        }
                    }


        });
    }
}