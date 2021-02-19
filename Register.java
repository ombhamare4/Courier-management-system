package com.courier;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;
public class Register extends JFrame{
    JPanel panel ;
    JLabel head , firstName , lastName , address , userName , password , phone , gender , showTextValid  ;
    JTextField firstText , lastText , phoneText , userText  ;
    JPasswordField passwordText ;
    JRadioButton male , female , other;
    ButtonGroup bg ;
    JTextArea  addressText  ;
    JButton register ;
    public Register(){
        setBounds(700, 100, 600, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        //Panel Setup
        panel = new JPanel();
        setContentPane(panel);
        panel.setLayout(null);
        panel.setBorder(new EmptyBorder(30, 30, 30, 30));
        panel.setBackground(new Color(41, 241, 195));

        //Labels and TextField
        head = new JLabel();
        head.setText("Register...");
        head.setFont(new Font("Times New Roman",Font.BOLD,36));
        head.setBounds(30, 10, 300, 50);
        panel.add(head);

        firstName = new JLabel();
        firstName.setText("First Name:");
        firstName.setFont(new Font("Times New Roman",Font.BOLD,28));
        firstName.setBounds(30, 70, 300, 50);
        panel.add(firstName);

        firstText = new JTextField();
        firstText.setBounds(200,80,300,30);
        firstText.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        panel.add(firstText);


        lastName = new JLabel();
        lastName.setText("Last Name :");
        lastName.setFont(new Font("Times New Roman",Font.BOLD,28));
        lastName.setBounds(30, 130, 300, 50);
        panel.add(lastName);

        lastText = new JTextField();
        lastText.setBounds(200,140,300,30);
        lastText.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        panel.add(lastText);


        userName = new JLabel();
        userName.setText("UserName  : ");
        userName.setFont(new Font("Times New Roman",Font.BOLD,28));
        userName.setBounds(30, 190, 300, 50);
        panel.add(userName);

        userText = new JTextField();
        userText.setBounds(200,200,300,30);
        userText.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        panel.add(userText);


        password = new JLabel();
        password.setText("Password   : ");
        password.setFont(new Font("Times New Roman",Font.BOLD,28));
        password.setBounds(30, 250, 300, 50);
        panel.add(password);

        passwordText = new JPasswordField();
        passwordText.setBounds(200,260,300,30);
        passwordText.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        panel.add(passwordText);


        gender = new JLabel();
        gender.setText("Gender : ");
        gender.setFont(new Font("Times New Roman",Font.BOLD,28));
        gender.setBounds(30, 300, 300, 50);
        panel.add(gender);

        //Radio Buttons
        male= new JRadioButton("Male");
        male.setBounds(200,300, 100 ,40);
        male.setBackground(new Color(41, 241, 195));
        male.setFont(new Font("Times New Roman",Font.BOLD,22));
        panel.add(male);

        female= new JRadioButton("Female");
        female.setBounds(300,300, 100 ,40);
        female.setBackground(new Color(41, 241, 195));
        female.setFont(new Font("Times New Roman",Font.BOLD,22));
        panel.add(female);

        other= new JRadioButton("Other");
        other.setBounds(400,300, 90 ,40);
        other.setBackground(new Color(41, 241, 195));
        other.setFont(new Font("Times New Roman",Font.BOLD,22));
        panel.add(other);

        bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);
        bg.add(other);

        phone = new JLabel();
        phone.setText("Phone No : ");
        phone.setFont(new Font("Times New Roman",Font.BOLD,28));
        phone.setBounds(30, 350, 300, 50);
        panel.add(phone);

        phoneText = new JTextField();
        phoneText.setBounds(200,360,300,30);
        phoneText.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        panel.add(phoneText);

        showTextValid = new JLabel();
        showTextValid.setText("");
        showTextValid.setFont(new Font("Times New Roman",Font.BOLD,15));
        showTextValid.setBounds(200, 375, 300, 50);
        panel.add(showTextValid);

        phoneText.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                try{
                    int i = Integer.parseInt(phoneText.getText());
                    showTextValid.setText("");
                }catch(NumberFormatException ae ){
                    showTextValid.setText("Invalid Number");
                }
            }
        });

        address = new JLabel();
        address.setText("Address : ");
        address.setFont(new Font("Times New Roman",Font.BOLD,28));
        address.setBounds(30, 400, 300, 50);
        panel.add(address);

        addressText = new JTextArea();
        addressText.setBounds(200,410,300,100);
        addressText.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        panel.add(addressText);

        //Register Button

        register = new JButton();
        register.setText("Register");
        register.setFont(new Font("Times New Roman", Font.BOLD, 20));
        register.setBounds(200, 550, 200, 50);
        register.setBackground(new Color(41, 241, 195));
        register.setForeground(Color.BLACK);
        panel.add(register);

        register.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                //Customer Page
                Start st = new Start();
                setVisible(true);
                pack();
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setVisible(false);
            }
        });

    }
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable(){
            public void run() {
                new Register();
            }
        });
    }
}
