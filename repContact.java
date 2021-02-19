package com.courier;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class repContact extends JFrame {
    JPanel panelrep;
    JLabel head,ename,econtact;
    JButton back;

    public repContact() {
        setBounds(700, 300, 500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        //Panel Setup
        panelrep = new JPanel();
        setContentPane(panelrep);
        panelrep.setLayout(null);
        panelrep.setBorder(new EmptyBorder(30, 30, 30, 30));
        panelrep.setBackground(new Color(46, 49, 49));
        //Login Label
        head = new JLabel();
        head.setText("Our Representative Contact");
        head.setForeground(Color.WHITE);
        head.setFont(new Font("Times New Roman", Font.BOLD, 35));
        head.setBounds(10, 0, 450, 70);
        panelrep.add(head);
        //name
        ename = new JLabel();
        ename.setText("Name:Aksahy Sharma");
        ename.setForeground(Color.WHITE);
        ename.setFont(new Font("Times New Roman", Font.BOLD, 30));
        ename.setBounds(10, 50, 300, 70);
        panelrep.add(ename);
        //contact
        econtact = new JLabel();
        econtact.setText("Contact: 8457619245");
        econtact.setForeground(Color.WHITE);
        econtact.setFont(new Font("Times New Roman", Font.BOLD, 30));
        econtact.setBounds(10, 110, 300, 70);
        panelrep.add(econtact);
        // back button
        back = new JButton();
        back.setText("OK");
        back.setFont(new Font("Times New Roman", Font.BOLD, 20));
        back.setBounds(200, 200, 100, 50);
        back.setBackground(new Color(83, 51, 237));
        back.setForeground(Color.WHITE);
        panelrep.add(back);
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                ClientPage clp = new ClientPage();
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
                new repContact();
            }
        });
    }
}
