package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Labarator4 extends JFrame {
    public static void main(String[] args) {
     int AlexInaltimea=175;
     int ElenaInaltimea=176;

        JFrame f = new JFrame();//creating instance of JFrame

        JButton Alex = new JButton("Alex");

        Alex.setBounds(130, 100, 200, 40);
        f.add(Alex);//adding button in JFrame
        Alex.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Inaltimea mea este "+AlexInaltimea+" cm");

            }
        });
        JButton Elena= new JButton("Elena");

        Elena.setBounds(130, 180, 200, 40);
        f.add(Elena);//adding button in JFrame
        Elena.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Inaltimea mea este "+ElenaInaltimea+" cm");

            }
        });
        JButton Schimba= new JButton("Schimba");

        Schimba.setBounds(130, 260, 200, 40);
        f.add(Schimba);//adding button in JFrame
        Schimba.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              Alex.setText("Elena");
              Elena.setText("Alex");


            }
        });
        f.setSize(400, 500);//400 width and 500 height
        f.setLayout(null);//using no layout managers
        f.setVisible(true);//making the frame visible

    }
}

