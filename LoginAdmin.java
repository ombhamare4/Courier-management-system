package com.courier;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
public class LoginAdmin extends JFrame{
    JPanel panel ;
    JLabel head , username , password;
    JButton login , backMenu ;
    JTextField uname  ;
    JPasswordField pass;
    //  JRadioButton r1 , r2 , r3 ;
    public LoginAdmin() {
        setBounds(700, 300, 700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        //Panel Setup
        panel = new JPanel();
        setContentPane(panel);
        panel.setLayout(null);
        panel.setBorder(new EmptyBorder(30, 30, 30, 30));
        panel.setBackground(new Color(25, 181, 254));

        //Label Setup
        //Login Label
        head = new JLabel();
        head.setText("Admin Login...");
        head.setFont(new Font("Times New Roman",Font.BOLD,36));
        head.setBounds(30, 10, 300, 50);
        panel.add(head);
        //Username Label and textField
        username = new JLabel();
        username.setText("Username : ");
        username.setFont(new Font("Times New Roman",Font.BOLD,25));
        username.setBounds(30, 80, 300, 50);
        panel.add(username);

        uname = new JTextField();
        uname.setBounds(200,80,350,50);
        uname.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        panel.add(uname);

        //Password
        password = new JLabel();
        password.setText("Password:");
        password.setFont(new Font("Times New Roman",Font.BOLD,25));
        password.setBounds(30, 140, 300, 50);
        panel.add(password);

        pass = new JPasswordField();
        pass.setBounds(200,140,350,50);
        pass.setFont(new Font("Times New Roman",0,25));
        panel.add(pass);

        //Login Button
        login = new JButton();
        login.setText("Login");
        login.setFont(new Font("Times New Roman", Font.BOLD, 20));
        login.setBounds(200, 200, 200, 50);
        login.setBackground(new Color(83, 51, 237));
        login.setForeground(Color.WHITE);
        panel.add(login);


        login.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                String name = uname.getText();
                String pw = pass.getText();
                String [] arr0 =new String[]{"Om Bhamare","Aman Lohani","Kushal Choudhary"};
                String [] arr1 =new String[]{"1234","5678","910111213"};

                if(name.equals(arr0[0])&&pw.equals(arr1[0])){
                    JOptionPane.showMessageDialog(null,"Success");
                    AdminPage cp = new AdminPage();
                    setVisible(true);
                    pack();
                    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    setVisible(false);
                }else
                if(name.equals(arr0[1])&&pw.equals(arr1[1])){
                    JOptionPane.showMessageDialog(null,"Success");

                    AdminPage cp = new AdminPage();
                    setVisible(true);
                    pack();
                    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    setVisible(false);
                }else
                if(name.equals(arr0[02])&&pw.equals(arr1[2])){
                    JOptionPane.showMessageDialog(null,"Success");

                    AdminPage cp = new AdminPage();
                    setVisible(true);
                    pack();
                    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    setVisible(false);
                }
                else{
                    JOptionPane.showMessageDialog(null,"Not Found");
                }

            }
        });

    }
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable(){
            public void run() {
                new LoginAdmin();
            }
        });
    }
}
