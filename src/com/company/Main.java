package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main {

    public static void main(String[] args) {
        int x=10;
        JFrame f = new JFrame();//creating instance of JFrame

        JButton b = new JButton("button 1");//creating instance of JButton
        b.setBounds(130, 100, 200, 40);//x axis, y axis, width, height

        f.add(b);//adding button in JFrame

        JButton button2 = new JButton("button 2");//creating instance of JButton
        button2.setBounds(160, 180, 200, 40);//x axis, y axis, width, height

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (x < 10 || x > 10) {

                    b.setText("x nu este 10 ");
                }
                if(x==10){
                    b.setText("x trebuie sa fie 10");
                }
            }
        });
        f.add(button2);//adding button in JFrame
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (x ==3) {

                    button2.setText("x este 3 si numele este Ala ");
                }
                if(x==10){
                    button2.setText("nu conteaza ce apara");
                }
            }
        });
        f.setSize(400, 500);
        JButton button3 = new JButton("button 3");//creating instance of JButton
        button3.setBounds(220, 300, 200, 40);//x axis, y axis, width, height
        f.add(button3);
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button3.setText("x este 3 si este numele Ala");
            }
        });
        JButton button4 = new JButton("button 4");//creating instance of JButton

        button4.setBounds(320, 400, 200, 40);//x axis, y axis, width, height
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button4.setText("raspunul este 5");
            }
        });
        f.add(button4);


                f.setSize(400, 500);//
                f.add(button2);//adding button in JFrame

                f.setSize(400, 500);//400 width and 500 height
                f.add(button3);
                f.setLayout(null);//using no layout managers
                f.setVisible(true);//making the frame visible

            }
        }


