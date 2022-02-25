package com.apps;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class FrontPage extends JFrame implements ActionListener {
    JButton b1,b2;
    JTextField t1;
    FrontPage(){

        //Creating frame with respect to screen and giving it, it's background color.
        setBounds(200,100,1200,500);
        getContentPane().setBackground(Color.ORANGE);
        setLayout(null);

        //Uploading and labelling image on the frame.
        ImageIcon I1 = new ImageIcon(ClassLoader.getSystemResource("com/apps/icons/login.jpg"));
        JLabel l1 = new JLabel(I1);
        l1.setBounds(0,-18,600,500);
        add(l1);

        //Printing and Labelling "Quiz Time" on the frame.
        JLabel l2 = new JLabel("Quiz Time");
        l2.setFont(new Font("Gabriola",Font.BOLD,40));
        l2.setForeground(Color.BLACK);
        l2.setBounds(810,50,300,85);
        add(l2);

        JLabel l3 = new JLabel("Enter Your Name");
        l3.setFont(new Font("Times New Roman",Font.BOLD,20));
        l3.setForeground(Color.RED);
        l3.setBounds(810,150,350,40);
        add(l3);

        //Creating Text Field
        t1 = new JTextField();
        t1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        t1.setBounds(730,200,300,20);
        add(t1);

        b1 = new JButton("Rules");
        b1.setBackground(Color.RED);
        b1.setForeground(Color.WHITE);
        b1.setBounds(730,260,80,25);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Exit");
        b2.setBackground(Color.RED);
        b2.setForeground(Color.WHITE);
        b2.setBounds(950,260,80,25);
        b2.addActionListener(this);
        add(b2);

        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            String name = t1.getText();
            this.setVisible(false);
            new Rules(name);
        }
        else{
            System.exit(0);
        }
    }

    public static void main(String[] args){
        new FrontPage();
    }


}
