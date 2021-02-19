package com.courier;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BillGenerator extends JFrame {
    JPanel panelbg;
  public  static JLabel head,contact1,contact2,originjcb,deljcb,total,pickName1,delName,pickAdd , delAdd ;
  public  static JLabel l1 ,l2 , l3 , l4 , l5 , l6 , l7 , l8 ,l9;
  public  static  JButton back;
    public BillGenerator(){
        setBounds(700, 300, 700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        //Panel Setup
        panelbg = new JPanel();
        setContentPane(panelbg);
        panelbg.setLayout(null);
        panelbg.setBorder(new EmptyBorder(30, 30, 30, 30));
        panelbg.setBackground(new Color(41, 241, 195));
        //Labels
        head = new JLabel();
        head.setText("Bill for package");
        head.setFont(new Font("Times New Roman",Font.BOLD,40));
        head.setBounds(40, 10, 300, 50);
        panelbg.add(head);
        //pickName
        pickName1 = new JLabel();
        pickName1.setText("From:");
        pickName1.setFont(new Font("Times New Roman",Font.BOLD,20));
        pickName1.setBounds(40, 50, 300, 50);
        panelbg.add(pickName1);

        l1 = new JLabel();
        l1.setFont(new Font("Times New Roman",Font.BOLD,20));
        l1.setBounds(100, 50, 300, 50);
        panelbg.add(l1);
        
        //originjcb
        originjcb = new JLabel();
        originjcb.setText("City:");
        originjcb.setFont(new Font("Times New Roman",Font.BOLD,20));
        originjcb.setBounds(300, 50, 300, 50);
        panelbg.add(originjcb);
        l4 = new JLabel();
        l4.setFont(new Font("Times New Roman",Font.BOLD,20));
        l4.setBounds(350, 50, 300, 50);
        panelbg.add(l4);
        //pickAdd
        pickAdd= new JLabel();
        pickAdd.setText("Pickup address:");
        pickAdd.setFont(new Font("Times New Roman",Font.BOLD,20));
        pickAdd.setBounds(40, 100, 300, 50);
        panelbg.add(pickAdd);
        

        l3 = new JLabel();
        l3.setFont(new Font("Times New Roman",Font.BOLD,20));
        l3.setBounds(175, 100, 300, 50);
        panelbg.add(l3);
        //contact1
        contact1 = new JLabel();
        contact1.setText("Contact no:");
        contact1.setFont(new Font("Times New Roman",Font.BOLD,20));
        contact1.setBounds(40, 150, 300, 50);
        panelbg.add(contact1);

        l2 = new JLabel();
        l2.setFont(new Font("Times New Roman",Font.BOLD,20));
        l2.setBounds(150, 150, 300, 50);
        panelbg.add(l2);

        //delName
        delName = new JLabel();
        delName.setText("Receiver:");
        delName.setFont(new Font("Times New Roman",Font.BOLD,20));
        delName.setBounds(40, 200, 300, 50);
         panelbg.add(delName);
        l5 = new JLabel();
        l5.setFont(new Font("Times New Roman",Font.BOLD,20));
        l5.setBounds(150, 200, 300, 50);
        panelbg.add(l5);

        //deljcb
        deljcb = new JLabel();
        deljcb.setText("City:");
        deljcb.setFont(new Font("Times New Roman",Font.BOLD,20));
        deljcb.setBounds(300, 200, 300, 50);
        panelbg.add(deljcb);
        l8 = new JLabel();
        l8.setFont(new Font("Times New Roman",Font.BOLD,20));
        l8.setBounds(350, 200, 300, 50);
        panelbg.add(l8);
        //delAdd
        delAdd = new JLabel();
        delAdd.setText("Drop address:");
        delAdd.setFont(new Font("Times New Roman",Font.BOLD,20));
        delAdd.setBounds(40, 250, 300, 50);
        panelbg.add(delAdd);
        l6 = new JLabel();
        l6.setFont(new Font("Times New Roman",Font.BOLD,20));
        l6.setBounds(170, 250, 300, 50);
        panelbg.add(l6);
        //contact2
        contact2 = new JLabel();
        contact2.setText("Contact no:");
        contact2.setFont(new Font("Times New Roman",Font.BOLD,20));
        contact2.setBounds(40, 300, 300, 50);
        panelbg.add(contact2);
        l7 = new JLabel();
        l7.setFont(new Font("Times New Roman",Font.BOLD,20));
        l7.setBounds(150, 300, 300, 50);
        panelbg.add(l7);
        //Total
        total = new JLabel();
        total.setText("Total cost:");
        total.setFont(new Font("Times New Roman",Font.BOLD,20));
        total.setBounds(40, 340, 300, 50);
        panelbg.add(total);
        l9 = new JLabel();
        l9.setText("1000");
        l9.setFont(new Font("Times New Roman",Font.BOLD,20));
        l9.setBounds(150, 340, 300, 50);
        panelbg.add(l9);
        //back
        back = new JButton();
        back.setText("OK");
        back.setFont(new Font("Times New Roman", Font.BOLD, 20));
        back.setBounds(450,350,100,50);
        back.setBackground(new Color(83, 51, 237));
        back.setForeground(Color.WHITE);
        panelbg.add(back);
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
                BillGenerator bg = new BillGenerator();
            }
        });
    }
}

