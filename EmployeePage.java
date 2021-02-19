package com.courier;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class EmployeePage extends JFrame {
    JPanel panelep;
    public static JLabel head, contact1, contact2, originjcb, deljcb, total, pickName1, delName, pickAdd, delAdd;

    public EmployeePage() {
        setBounds(700, 300, 700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        //Panel Setup
        panelep = new JPanel();
        setContentPane(panelep);
        panelep.setLayout(null);
        panelep.setBorder(new EmptyBorder(30, 30, 30, 30));
        panelep.setBackground(new Color(41, 241, 195));
        //Labels
        head = new JLabel();
        head.setText("Details of package");
        head.setFont(new Font("Times New Roman", Font.BOLD, 40));
        head.setBounds(40, 10, 300, 50);
        panelep.add(head);
        //pickName
        pickName1 = new JLabel();
        pickName1.setText("From:Prem");
        pickName1.setFont(new Font("Times New Roman", Font.BOLD, 20));
        pickName1.setBounds(40, 50, 300, 50);
        panelep.add(pickName1);
        //Origin
        originjcb = new JLabel();
        originjcb.setText("City:Mumbai");
        originjcb.setFont(new Font("Times New Roman", Font.BOLD, 20));
        originjcb.setBounds(300, 50, 300, 50);
        panelep.add(originjcb);
        //pickAdd
        pickAdd = new JLabel();
        pickAdd.setText("Pickup address:Gulmohar heights");
        pickAdd.setFont(new Font("Times New Roman", Font.BOLD, 20));
        pickAdd.setBounds(40, 100, 300, 50);
        panelep.add(pickAdd);
        //contact1
        contact1 = new JLabel();
        contact1.setText("Contact no:8484845125");
        contact1.setFont(new Font("Times New Roman", Font.BOLD, 20));
        contact1.setBounds(40, 150, 300, 50);
        panelep.add(contact1);
        delName = new JLabel();
        delName.setText("Receiver:Ram");
        delName.setFont(new Font("Times New Roman", Font.BOLD, 20));
        delName.setBounds(40, 200, 300, 50);
        panelep.add(delName);
        //deljcb
        deljcb = new JLabel();
        deljcb.setText("City:Kolkata");
        deljcb.setFont(new Font("Times New Roman", Font.BOLD, 20));
        deljcb.setBounds(300, 200, 300, 50);
        panelep.add(deljcb);
        //delAdd
        delAdd = new JLabel();
        delAdd.setText("Drop address:Everest villa");
        delAdd.setFont(new Font("Times New Roman", Font.BOLD, 20));
        delAdd.setBounds(40, 250, 300, 50);
        panelep.add(delAdd);
        contact2 = new JLabel();
        contact2.setText("Contact no:9546834410");
        contact2.setFont(new Font("Times New Roman", Font.BOLD, 20));
        contact2.setBounds(40, 300, 300, 50);
        panelep.add(contact2);
        total = new JLabel();
        total.setText("Total cost:1500");
        total.setFont(new Font("Times New Roman", Font.BOLD, 20));
        total.setBounds(40, 340, 300, 50);
        panelep.add(total);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                EmployeePage emp = new EmployeePage();
            }
        });
    }
}