package com.courier;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class setDelivery extends JFrame {
    JPanel panel ;
    JLabel head , origin , destination , content , weight , serviceType , dim;
    JTextField  weightText , lengthText ,breatheText  ;
    JComboBox jcb , wt , ht , originjcb , deljcb ;
    JRadioButton prem , gol , sil ;
    ButtonGroup bg ;
    JButton setDel ;
    Double cost;
    public setDelivery() {
        //Window Setup
        setBounds(500, 200, 1000, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        //Panel Setup
        panel = new JPanel();
        setContentPane(panel);
        panel.setLayout(null);
        panel.setBorder(new EmptyBorder(30, 30, 30, 30));
        panel.setBackground(new Color(46, 49, 49));
        //head label
        head = new JLabel();
        head.setText("Set Delivery");
        head.setForeground(Color.WHITE);
        head.setFont(new Font("Times New Roman", Font.BOLD, 36));
        head.setBounds(50, 20, 700, 50);
        panel.add(head);
        //origin
        origin = new JLabel();
        origin.setText("Origin*");
        origin.setForeground(Color.WHITE);
        origin.setFont(new Font("Times New Roman", Font.BOLD, 24));
        origin.setBounds(50, 70, 100, 50);
        panel.add(origin);

        originjcb = new JComboBox<String>();
        originjcb.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        originjcb.addItem("Mumbai");
        originjcb.addItem("Delhi");
        originjcb.addItem("Kolkata");
        originjcb.addItem("Chennai");
        originjcb.setBounds(50, 130, 160, 30);
        panel.add(originjcb);

        //Desitnation
        destination = new JLabel();
        destination.setText("Desitnation*");
        destination.setForeground(Color.WHITE);
        destination.setFont(new Font("Times New Roman", Font.BOLD, 24));
        destination.setBounds(250, 70, 200, 50);
        panel.add(destination);

        deljcb = new JComboBox<String>();
        deljcb.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        deljcb.addItem("Mumbai");
        deljcb.addItem("Delhi");
        deljcb.addItem("Kolkata");
        deljcb.addItem("Chennai");
        deljcb.addItem("Bangalore");
        deljcb.addItem("Hyderabad");
        deljcb.addItem("Patna");
        deljcb.addItem("Ahemdabad");
        deljcb.setBounds(250, 130, 160, 30);
        panel.add(deljcb);

        //Content Details
        content = new JLabel();
        content.setText("Content*");
        content.setBounds(50, 200, 160, 30);
        content.setForeground(Color.WHITE);
        content.setFont(new Font("Times New Roman", Font.BOLD, 24));
        panel.add(content);

        jcb = new JComboBox<String>();
        jcb.setFont(new java.awt.Font("Times New Roman", 0, 20));
        jcb.addItem("Documents");
        jcb.addItem("Home Appliance");
        jcb.addItem("Electronics");
        jcb.addItem("Medicines");
        jcb.setBounds(50, 250, 160, 30);
        panel.add(jcb);

        //Weight
        weight = new JLabel();
        weight.setText("Weight*");
        weight.setForeground(Color.WHITE);
        weight.setFont(new Font("Times New Roman", Font.BOLD, 24));
        weight.setBounds(250, 200, 100, 50);
        panel.add(weight);

        weightText = new JTextField();
        weightText.setText("0");
        weightText.setBounds(250, 250, 50, 30);
        weightText.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        panel.add(weightText);

        wt = new JComboBox<String>();
        wt.setFont(new java.awt.Font("Times New Roman", 0, 20));
        wt.addItem("Kg");
        wt.addItem("gm");
        wt.setBounds(310, 250, 100, 30);
        panel.add(wt);

        dim = new JLabel();
        dim.setText("Dimensions*(l x b)");
        dim.setForeground(Color.WHITE);
        dim.setFont(new Font("Times New Roman", Font.BOLD, 24));
        dim.setBounds(450, 200, 200, 50);
        panel.add(dim);

        lengthText = new JTextField();
        lengthText.setBounds(450, 250, 50, 30);
        lengthText.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        panel.add(lengthText);

        breatheText = new JTextField();
        breatheText.setBounds(530, 250, 50, 30);
        breatheText.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        panel.add(breatheText);

        ht = new JComboBox<String>();
        ht.setFont(new java.awt.Font("Times New Roman", 0, 20));
        ht.addItem("cm");
        ht.addItem("inch");
        ht.addItem("m");
        ht.setBounds(600, 250, 70, 30);
        panel.add(ht);

        serviceType = new JLabel();
        serviceType.setText("Service Type*");
        serviceType.setBounds(50, 320, 160, 30);
        serviceType.setForeground(Color.WHITE);
        serviceType.setFont(new Font("Times New Roman", Font.BOLD, 24));
        panel.add(serviceType);

        prem = new JRadioButton("Premium");
        prem.setBounds(50, 360, 120, 30);
        prem.setFont(new Font("Times New Roman", Font.BOLD, 18));
        prem.setForeground(Color.WHITE);
        prem.setBackground(new Color(46, 49, 49));
        panel.add(prem);

        gol = new JRadioButton("Gold");
        gol.setBounds(200, 360, 120, 30);
        gol.setFont(new Font("Times New Roman", Font.BOLD, 18));
        gol.setForeground(Color.WHITE);
        gol.setBackground(new Color(46, 49, 49));
        panel.add(gol);

        sil = new JRadioButton("Silver");
        sil.setBounds(350, 360, 120, 30);
        sil.setFont(new Font("Times New Roman", Font.BOLD, 18));
        sil.setForeground(Color.WHITE);
        sil.setBackground(new Color(46, 49, 49));
        panel.add(sil);

        bg = new ButtonGroup();
        bg.add(prem);
        bg.add(gol);
        bg.add(sil);

        //Set Delivery
        setDel = new JButton();
        setDel.setText("Set Delivery");
        setDel.setFont(new Font("Times New Roman", Font.BOLD, 20));
        setDel.setBounds(50, 420, 200, 50);
        setDel.setBackground(new Color(46, 49, 49));
        setDel.setForeground(Color.WHITE);
        panel.add(setDel);

        setDel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                PickDel pd = new PickDel();
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
                new setDelivery();
            }
        });
    }
}
