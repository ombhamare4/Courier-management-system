package com.courier;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
public class Login extends JFrame {
    JPanel panel ;
    JLabel head , username , password;
    JButton login , backMenu ;
    JTextField uname  ;
    JPasswordField pass;

    Connection connection = null;

    public Login() {
        setBounds(700, 300, 700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        //Panel Setup
        panel = new JPanel();
        setContentPane(panel);
        panel.setLayout(null);
        panel.setBorder(new EmptyBorder(30, 30, 30, 30));
        panel.setBackground(new Color(255, 203, 5));

        //Label Setup
        //Login Label
        head = new JLabel();
        head.setText("Login...");
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

        //Already logged in
        backMenu = new JButton();
        backMenu.setText("New Login ?");
        backMenu.setFont(new Font("Times New Roman", Font.BOLD, 20));
        backMenu.setBounds(200, 275, 200, 50);
        backMenu.setBackground(new Color(41, 241, 195));
        backMenu.setForeground(Color.BLACK);
        panel.add(backMenu);

        //Action Listeners
        login.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                String name = uname.getText();
                String pw = pass.getText();
                String [] arr0 =new String[]{"Teju","CrisM","shur","Tanmay","Palak"};
                String [] arr1 =new String[]{"1234","5678","shur","Tan","palu"};

                if(name.equals(arr0[0])&&pw.equals(arr1[0])){
                    JOptionPane.showMessageDialog(null,"Success");
                    ClientPage cp = new ClientPage();
                    setVisible(true);
                    pack();
                    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    setVisible(false);
                }else
                if(name.equals(arr0[1])&&pw.equals(arr1[1])){
                    JOptionPane.showMessageDialog(null,"Success");

                   ClientPage cp = new ClientPage();
                    setVisible(true);
                    pack();
                    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    setVisible(false);
                }else
                if(name.equals(arr0[02])&&pw.equals(arr1[2])){
                    JOptionPane.showMessageDialog(null,"Success");

                    ClientPage cp = new ClientPage();
                    setVisible(true);
                    pack();
                    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    setVisible(false);
                }
                else
                if(name.equals(arr0[03])&&pw.equals(arr1[3])){
                    JOptionPane.showMessageDialog(null,"Success");

                    ClientPage cp = new ClientPage();
                    setVisible(true);
                    pack();
                    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    setVisible(false);
                }
                else
                if(name.equals(arr0[04])&&pw.equals(arr1[4])){
                    JOptionPane.showMessageDialog(null,"Success");

                    ClientPage cp = new ClientPage();
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

        backMenu.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                //Customer Page
                Register reg = new Register();
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
                new Login();
            }
        });
    }
}
