package com.courier;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Start extends JFrame {
    JPanel panel ;
    JLabel head ;
    JButton login , loginAdmin , loginEmployee ;
    public Start() {
        //Window Setup
        setBounds(700, 300, 700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        //Panel Setup
        panel = new JPanel();
        setContentPane(panel);
        panel.setLayout(null);
        panel.setBorder(new EmptyBorder(30, 30, 30, 30));
        panel.setBackground(new Color(46, 49, 49));
        //lables setup
        JLabel head = new JLabel();
        head.setText("Courier Management System");
        head.setForeground(Color.WHITE);
        head.setFont(new Font("Times New Roman", Font.BOLD, 36));
        head.setBounds(126, 50, 700, 50);
        panel.add(head);

        //Button Setup
        //login and register option
        login = new JButton("Customer");
        login.setFont(new Font("Times New Roman", Font.BOLD, 20));
        login.setBounds(239, 150, 200, 50);
        login.setBackground(new Color(255, 203, 5));
        panel.add(login);

        loginAdmin = new JButton("Admin");
        loginAdmin.setFont(new Font("Times New Roman", Font.BOLD, 20));
        loginAdmin.setBounds(239, 220, 200, 50);
        loginAdmin.setBackground(new Color(25, 181, 254));
        panel.add(loginAdmin);

        loginEmployee = new JButton("Employee");
        loginEmployee.setFont(new Font("Times New Roman", Font.BOLD, 20));
        loginEmployee.setBounds(239, 290, 200, 50);
        loginEmployee.setBackground(new Color(246, 71, 71));
        panel.add(loginEmployee);

        //By clicking Button open new window
        login.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                Login log = new Login();
                setVisible(true);
                pack();
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setVisible(false);
            }
        });
        loginAdmin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                LoginAdmin logAd = new LoginAdmin();
                setVisible(true);
                pack();
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setVisible(false);
            }
        });
        loginEmployee.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                LoginEmployee logEm = new LoginEmployee();
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
                new Start();
            }
        });
    }

}
