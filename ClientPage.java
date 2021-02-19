package com.courier;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClientPage extends JFrame {
    JButton bill,rate,setdel,deldetail;
    JPanel panelcli;
    JLabel head;
    public ClientPage()
    {
        setBounds(700, 300, 700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        //Panel Setup
        panelcli = new JPanel();
        setContentPane(panelcli);
        panelcli.setLayout(null);
        panelcli.setBorder(new EmptyBorder(30, 30, 30, 30));
        panelcli.setBackground(new Color(46, 49, 49));
        //Login Label
        head = new JLabel();
        head.setText("Menu.....");
        head.setForeground(Color.WHITE);
        head.setFont(new Font("Times New Roman",Font.BOLD,45));
        head.setBounds(230, 40, 300, 70);
        panelcli.add(head);
        //Rate button
        rate = new JButton("Rate Chart");
        rate.setFont(new Font("Times New Roman", Font.BOLD, 20));
        rate.setBounds(210, 130, 260, 50);
        rate.setBackground(new Color(255, 203, 5));
        panelcli.add(rate);

        setdel = new JButton("Set Delivery");
        setdel.setFont(new Font("Times New Roman", Font.BOLD, 20));
        setdel.setBounds(210, 200, 260, 50);
        setdel.setBackground(new Color(25, 181, 254));
        panelcli.add(setdel);

        deldetail = new JButton("Representative contact");
        deldetail.setFont(new Font("Times New Roman", Font.BOLD, 20));
        deldetail.setBounds(210, 270, 260, 50);
        deldetail.setBackground(new Color(246, 71, 71));
        panelcli.add(deldetail);

        rate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                RateChart rc = new RateChart();
                setVisible(true);
                pack();
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setVisible(false);
            }
        });

        setdel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                setDelivery sd = new setDelivery();
                setVisible(true);
                pack();
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setVisible(false);
            }
        });

        deldetail.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                repContact rep = new repContact();
                setVisible(true);
                pack();
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setVisible(false);
            }
        });

    }
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientPage();
            }
        });
    }
}
