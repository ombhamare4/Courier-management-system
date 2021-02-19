package com.courier;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PickDel extends JFrame {
    JPanel panel ;
public static JLabel pick;
    public static JLabel del , costs;
   public  JButton submit ;
   public  JTextField  contact1 , contact2 ,pickName , delName ;
   JComboBox  originjcb , deljcb ;
  public  JTextArea pickAdd , delAdd ;
    public PickDel(){
      
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

        pick = new JLabel();
        pick.setText("From");
        pick.setForeground(Color.WHITE);
        pick.setFont(new Font("Times New Roman", Font.BOLD, 36));
        pick.setBounds(50, 20, 700, 50);
        panel.add(pick);

        pickName = new JTextField(10);
       // pickName.setText("Name");
        pickName.setBounds(50,70,200,30);
        pickName.setForeground(new Color(108, 122, 137));
        pickName.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        panel.add(pickName);

        contact1 = new JTextField(10);
        contact1.setText("Contact");
        contact1.setBounds(350,70,200,30);
        contact1.setForeground(new Color(108, 122, 137));
        contact1.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        panel.add(contact1);

        pickAdd = new JTextArea();
        pickAdd.setText("Address");
        pickAdd.setBounds(50,150,300,50);
        pickAdd.setForeground(new Color(108, 122, 137));
        pickAdd.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        panel.add(pickAdd);

        del = new JLabel();
        del.setText("To");
        del.setForeground(Color.WHITE);
        del.setFont(new Font("Times New Roman", Font.BOLD, 36));
        del.setBounds(50, 220, 700, 50);
        panel.add(del);

        delName = new JTextField(10);
        delName.setText("Name");
        delName.setBounds(50,270,200,30);
        delName.setForeground(new Color(108, 122, 137));
        delName.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        panel.add(delName);

        contact2 = new JTextField(10);
        contact2.setText("Contact");
        contact2.setBounds(350,270,200,30);
        contact2.setForeground(new Color(108, 122, 137));
        contact2.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        panel.add(contact2);

        delAdd = new JTextArea();
        delAdd.setText("Address");
        delAdd.setBounds(50,350,300,50);
        delAdd.setForeground(new Color(108, 122, 137));
        delAdd.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        panel.add(delAdd);

        submit = new JButton();
        submit.setText("Submit");
        submit.setFont(new java.awt.Font("Times New Roman", 0, 22));
        submit.setBackground(new Color(46, 49, 49));
        submit.setForeground( Color.WHITE);
        submit.setBounds(50,420,150,50);
        panel.add(submit);

        originjcb = new JComboBox<String>();
        originjcb.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        originjcb.addItem("Mumbai");
        originjcb.addItem("Delhi");
        originjcb.addItem("Kolkata");
        originjcb.addItem("Chennai");
        originjcb.setBounds(620,70,200,30);
        panel.add(originjcb);

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
        deljcb.setBounds(620,270,200,30);
        panel.add(deljcb);

        submit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                String pick = pickName.getText();
                String con1 = contact1.getText();
                String padd = pickAdd.getText();
                String del = delName.getText();
                String con2 = contact2.getText();
                String dadd = delAdd.getText();
                String selectedCity1 = originjcb.getSelectedItem().toString();
                String selectedCity2 = deljcb.getSelectedItem().toString();

               BillGenerator bg = new BillGenerator();
                bg.l1.setText(pick);
                bg.l2.setText(con1);
                bg.l3.setText(padd);
                bg.l4.setText(selectedCity1);

                bg.l5.setText(del);
                bg.l6.setText(dadd);
                bg.l7.setText(con2);
                bg.l8.setText(selectedCity2);

                setVisible(true);
                pack();
                setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                setVisible(false);
            }
        });
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {

                PickDel pd = new PickDel();
            }
        });
    }
}

