package com.courier;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RateChart extends JFrame {
    JLabel type;
    JButton home,doc,meds;
    JPanel panelrc;
    public RateChart() {
        //Window Setup
        setBounds(700, 300, 700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        //Panel Setup
        panelrc = new JPanel();
        setContentPane(panelrc);
        panelrc.setLayout(null);
        panelrc.setBorder(new EmptyBorder(30, 30, 30, 30));
        panelrc.setBackground(new Color(46, 49, 49));

        //Label Setup
       type= new JLabel();
       type.setText("Select the type to check our price.");
        type.setForeground(Color.WHITE);
       type.setFont(new Font("Times New Roman",Font.BOLD,35));
       type.setBounds(20,20,550,50);
       panelrc.add(type);
       //home type button
        home = new JButton();
        home.setText("Home Appliance");
        home.setFont(new Font("Times New Roman",Font.BOLD,20));
        home.setBackground(new Color(255, 203, 5));
        home.setBounds(220,150,250,50);
        add(home);
        home.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                home h = new home();
                setVisible(true);
                h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setVisible(false);
            }
        });
        //document type button
        doc = new JButton();
        doc.setText("Documents");
        doc.setFont(new Font("Times New Roman",Font.BOLD,20));
        doc.setBackground(new Color(25, 181, 254));
        doc.setBounds(220,220,250,50);
        add(doc);
        doc.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                doc d = new doc();
                setVisible(true);
                d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setVisible(false);
            }
        });
        //medicines type button
        meds = new JButton();
        meds.setText("Electronic");
        meds.setFont(new Font("Times New Roman",Font.BOLD,20));
        meds.setBackground(new Color(246, 71, 71));
        meds.setBounds(220,290,250,50);
        add(meds);
        meds.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                meds m = new meds();
                setVisible(true);
                m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setVisible(false);
            }
        });

    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RateChart();
            }
        });
    }
}
class doc extends JFrame{
    JLabel head;
    JTabbedPane jtp1;
    public doc(){
        setBounds(700, 300, 700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        jtp1 = new JTabbedPane();
        jtp1.setBounds(0,50,100,150);
        jtp1.addTab("Mumbai", new mumd());
        jtp1.addTab("Kolkata", new kold());
        jtp1.addTab("Chennai", new ched());
        jtp1.addTab("Delhi", new deld());
        add(jtp1);
    }
}
class mumd extends JPanel{
    String [] info1 = {"Destination","Premium","Gold","Silver"};
    Object [][] data1 ={
            {"Mumbai","100","50","20"},{"Delhi","200","150","100"},
            {"Kolkata","250","200","150"},{"Chennai","200","150","100"},
            {"Bangalore","200","150","100"},{"Hyderabad","200","150","100"},
            {"Patna","250","200","150"},{"Ahemdabad","100","50","20"}
    };
    public mumd(){
        JTable table = new JTable(data1,info1);
        table.setBounds(0,50,100,100);
        JScrollPane jsp = new JScrollPane(table);
        add(jsp);


    }
}
class kold extends JPanel{
    String [] info1 = {"Destination","Premium","Gold","Silver"};
    Object [][] data1 ={
            {"Mumbai","250","200","150"},{"Delhi","200","150","100"},
            {"Kolkata","100","50","20"},{"Chennai","200","150","100"},
            {"Bangalore","200","150","100"},{"Hyderabad","200","150","100"},
            {"Patna","100","50","20"},{"Ahemdabad","250","200","150"}
    };
    public kold(){
        JTable table = new JTable(data1,info1);
        table.setBounds(0,50,100,100);
        JScrollPane jsp = new JScrollPane(table);
        add(jsp);
    }
}
class ched extends JPanel{
    String [] info1 = {"Destination","Premium","Gold","Silver"};
    Object [][] data1 ={
            {"Mumbai","250","200","150"},{"Delhi","200","150","100"},
            {"Kolkata","200","150","100"},{"Chennai","100","50","20"},
            {"Bangalore","100","50","20"},{"Hyderabad","100","50","20"},
            {"Patna","200","150","100"},{"Ahemdabad","250","200","150"}
    };
    public ched(){
        JTable table = new JTable(data1,info1);
        table.setBounds(0,50,100,100);
        JScrollPane jsp = new JScrollPane(table);
        add(jsp);
    }
}
class deld extends JPanel{
    String [] info1 = {"Destination","Premium","Gold","Silver"};
    Object [][] data1 ={
            {"Mumbai","150","100","50"},{"Delhi","100","50","20"},
            {"Kolkata","200","150","100"},{"Chennai","100","50","20"},
            {"Bangalore","100","50","20"},{"Hyderabad","100","50","20"},
            {"Patna","200","150","100"},{"Ahemdabad","250","200","150"}
    };
    public deld(){
        JTable table = new JTable(data1,info1);
        table.setBounds(0,50,100,100);
        JScrollPane jsp = new JScrollPane(table);
        add(jsp);
    }
}
class home extends JFrame{
    JLabel head;
    JTabbedPane jtp1;
    public home(){
        setBounds(700, 300, 700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        jtp1 = new JTabbedPane();
        jtp1.setBounds(0,50,100,150);
        jtp1.addTab("Mumbai", new mumh());
        jtp1.addTab("Kolkata", new kolh());
        jtp1.addTab("Chennai", new cheh());
        jtp1.addTab("Delhi", new delh());
        add(jtp1);
    }
}
class mumh extends JPanel{
    String [] info1 = {"Destination","Premium","Gold","Silver"};
    Object [][] data1 ={
            {"Mumbai","100","50","20"},{"Delhi","200","150","100"},
            {"Kolkata","250","200","150"},{"Chennai","200","150","100"},
            {"Bangalore","200","150","100"},{"Hyderabad","200","150","100"},
            {"Patna","250","200","150"},{"Ahemdabad","100","50","20"}
    };
    public mumh(){
        JTable table = new JTable(data1,info1);
        table.setBounds(0,50,100,100);
        JScrollPane jsp = new JScrollPane(table);
        add(jsp);
    }
}
class kolh extends JPanel{
    String [] info1 = {"Destination","Premium","Gold","Silver"};
    Object [][] data1 ={
            {"Mumbai","250","200","150"},{"Delhi","200","150","100"},
            {"Kolkata","100","50","20"},{"Chennai","200","150","100"},
            {"Bangalore","200","150","100"},{"Hyderabad","200","150","100"},
            {"Patna","100","50","20"},{"Ahemdabad","250","200","150"}
    };
    public kolh(){
        JTable table = new JTable(data1,info1);
        table.setBounds(0,50,100,100);
        JScrollPane jsp = new JScrollPane(table);
        add(jsp);
    }
}
class cheh extends JPanel{
    String [] info1 = {"Destination","Premium","Gold","Silver" };
    Object [][] data1 ={
            {"Mumbai","250","200","150"},{"Delhi","200","150","100"},
            {"Kolkata","200","150","100"},{"Chennai","100","50","20"},
            {"Bangalore","100","50","20"},{"Hyderabad","100","50","20"},
            {"Patna","200","150","100"},{"Ahemdabad","250","200","150"}
    };
    public cheh(){
        JTable table = new JTable(data1,info1);
        table.setBounds(0,50,100,100);
        JScrollPane jsp = new JScrollPane(table);
        add(jsp);
    }
}
class delh extends JPanel{
    String [] info1 = {"Destination","Premium","Gold","Silver"};
    Object [][] data1 ={
            {"Mumbai","150","100","50"},{"Delhi","100","50","20"},
            {"Kolkata","200","150","100"},{"Chennai","100","50","20"},
            {"Bangalore","100","50","20"},{"Hyderabad","100","50","20"},
            {"Patna","200","150","100"},{"Ahemdabad","250","200","150"}
    };
    public delh(){
        JTable table = new JTable(data1,info1);
        table.setBounds(0,50,100,100);
        JScrollPane jsp = new JScrollPane(table);
        add(jsp);
    }
}
class meds extends JFrame{
    JLabel head;
    JTabbedPane jtp1;
    public meds(){
        setBounds(700, 300, 700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        jtp1 = new JTabbedPane();
        jtp1.setBounds(0,50,100,150);
        jtp1.addTab("Mumbai", new mumm());
        jtp1.addTab("Kolkata", new kolm());
        jtp1.addTab("Chennai", new chem());
        jtp1.addTab("Delhi", new delm());
        add(jtp1);
    }
}
class mumm extends JPanel{
    String [] info1 = {"Destination","Premium","Gold","Silver"};
    Object [][] data1 ={
            {"Mumbai","100","50","20"},{"Delhi","200","150","100"},
            {"Kolkata","250","200","150"},{"Chennai","200","150","100"},
            {"Bangalore","200","150","100"},{"Hyderabad","200","150","100"},
            {"Patna","250","200","150"},{"Ahemdabad","100","50","20"}
    };
    public mumm(){
        JTable table = new JTable(data1,info1);
        table.setBounds(0,50,100,100);
        JScrollPane jsp = new JScrollPane(table);
        add(jsp);
    }
}
class kolm extends JPanel{
        String [] info1 = {"Destination","Premium","Gold","Silver" };
    Object [][] data1 ={
            {"Mumbai","250","200","150"},{"Delhi","200","150","100"},
            {"Kolkata","100","50","20"},{"Chennai","200","150","100"},
            {"Bangalore","200","150","100"},{"Hyderabad","200","150","100"},
            {"Patna","100","50","20"},{"Ahemdabad","250","200","150"}
    };
    public kolm(){
        JTable table = new JTable(data1,info1);
        table.setBounds(0,50,100,100);
        JScrollPane jsp = new JScrollPane(table);
        add(jsp);
    }
}
class chem extends JPanel{
    String [] info1 = { "Destination","Premium","Gold","Silver"};
    Object [][] data1 ={
            {"Mumbai","250","200","150"},{"Delhi","200","150","100"},
            {"Kolkata","200","150","100"},{"Chennai","100","50","20"},
            {"Bangalore","100","50","20"},{"Hyderabad","100","50","20"},
            {"Patna","200","150","100"},{"Ahemdabad","250","200","150"}
    };
    public chem(){
        JTable table = new JTable(data1,info1);
        table.setBounds(0,50,100,100);
        JScrollPane jsp = new JScrollPane(table);
        add(jsp);
    }
}
class delm extends JPanel{
    String [] info1 = {"Destination","Premium","Gold","Silver"};
    Object [][] data1 ={
            {"Mumbai","150","100","50"},{"Delhi","100","50","20"},
            {"Kolkata","200","150","100"},{"Chennai","100","50","20"},
            {"Bangalore","100","50","20"},{"Hyderabad","100","50","20"},
            {"Patna","200","150","100"},{"Ahemdabad","250","200","150"}
    };
    public delm(){
        JTable table = new JTable(data1,info1);
        table.setBounds(0,50,100,100);
        JScrollPane jsp = new JScrollPane(table);
        add(jsp);
    }
}
