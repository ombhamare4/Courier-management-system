package com.courier;


import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminPage extends JFrame {
    // JPanel panel ;
    JLabel head;
    JButton cusdet, emde, bige, rach ;
    JPanel panelcli;
    public AdminPage(){
        //Window Setup
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

        head = new JLabel();
        head.setText("Menu....");
        head.setFont(new Font("Times New Roman", Font.BOLD, 40));
        head.setForeground(Color.WHITE);
        head.setBounds(126, 50, 700, 50);
        panelcli.add(head);

        cusdet = new JButton("Customer Detail");
        cusdet.setFont(new Font("Times New Roman", Font.BOLD, 20));
        cusdet.setBounds(239, 130, 200, 50);
        cusdet.setBackground(new Color(255, 203, 5));
        panelcli.add(cusdet);

        emde = new JButton("Employee Detail");
        emde.setFont(new Font("Times New Roman", Font.BOLD, 20));
        emde.setBounds(239, 200, 200, 50);
        emde.setBackground(new Color(25, 181, 254));
        panelcli.add(emde);

        rach = new JButton("Rate Chart");
        rach.setFont(new Font("Times New Roman", Font.BOLD, 20));
        rach.setBounds(239, 270, 200, 50);
        rach.setBackground(new Color(246, 71, 71));
        panelcli.add(rach);

        rach.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                RateChart rc = new RateChart();
                setVisible(true);
                pack();
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setVisible(false);

            }
        });

        cusdet.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                CustomerDetail cd = new CustomerDetail();
                setVisible(true);
                pack();
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setVisible(false);

            }
        });
        emde.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                EmployeeDetail ed = new EmployeeDetail();
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
                new AdminPage();
            }
        });
    }
}
class CustomerDetail extends JFrame{
    String [] info1 = {"First Name" ,"Last Name","User Name","Contact","Gender","Address" };
    Object [][] data1 ={
            {"First Name" ,"Last Name","User Name","Contact","Gender","Address" },
            {"Tejas","Patil","Teju","9753373928","Male","Mumbai"},
            {"Cris","Martin","CrisM","9657382633","Male","Delhi"},
            {"Shruti","Gupta","shur","7869352211","Female","Patna"},
            {"Tanmay","Bhat","Tanmay","9456312785","Male","Kolkata"},
            {"Palak","Patel","Palak","7788645291","Female","Mumbai"}
    };
    JPanel panelcd = new JPanel();
    JLabel head;
    JButton back;
    public CustomerDetail(){
        setBounds(700, 300, 700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        //Panel Setup
        panelcd = new JPanel();
        setContentPane(panelcd);
        panelcd.setLayout(null);
        panelcd.setBorder(new EmptyBorder(30, 30, 30, 30));
        panelcd.setBackground(new Color(241, 169, 160));
        head = new JLabel();
        head.setText("Customer Detail");
        head.setFont(new Font("Times New Roman", Font.BOLD, 40));
        head.setForeground(Color.BLACK);
        head.setBounds(120, 20, 700, 50);
        panelcd.add(head);
        JTable table = new JTable(data1,info1);
        table.setBounds(90,80,500,250);
        panelcd.add(table);
        //back
        back = new JButton();
        back.setText("OK");
        back.setFont(new Font("Times New Roman", Font.BOLD, 20));
        back.setBounds(450, 360, 100, 40);
        back.setBackground(new Color(83, 51, 237));
        back.setForeground(Color.WHITE);
        panelcd.add(back);
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                AdminPage ap = new AdminPage();
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
                new CustomerDetail();
            }
        });
    }
}
class EmployeeDetail extends JFrame{
    String [] info2 = {"First Name","Last name","Employee code","Contact","Gender","Address"};
    Object [][] data2 = {{"First Name","Last name","Employee code","Contact","Gender","Address"},
            {"Ram","Charan","R01","8585426422","Male","Mumbai"},
            {"Gaurav","Taneja","G01","8457691385","Male","Delhi"},
            {"Akshay","Sharma","A01","7895486150","Male","Kolkata"},
            {"Ajay","Nagar","A02","8954679573","Male","Chennai"}
    };
    JPanel paneled;
    JLabel head;
    JButton back;
    public EmployeeDetail(){
        setBounds(700, 300, 700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        //Panel Setup
        paneled = new JPanel();
        setContentPane(paneled);
        paneled.setLayout(null);
        paneled.setBorder(new EmptyBorder(30, 30, 30, 30));
        paneled.setBackground(new Color(241, 169, 160));
        head = new JLabel();
        head.setText("Employee Detail");
        head.setFont(new Font("Times New Roman", Font.BOLD, 40));
        head.setForeground(Color.BLACK);
        head.setBounds(120, 20, 700, 50);
        paneled.add(head);
        JTable table = new JTable(data2,info2);
        table.setBounds(90,80,500,250);
        paneled.add(table);
        back = new JButton();
        back.setText("OK");
        back.setFont(new Font("Times New Roman", Font.BOLD, 20));
        back.setBounds(450, 360, 100, 40);
        back.setBackground(new Color(83, 51, 237));
        back.setForeground(Color.WHITE);
        paneled.add(back);
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                AdminPage ap = new AdminPage();
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
                new EmployeeDetail();
            }
        });
    }
}
