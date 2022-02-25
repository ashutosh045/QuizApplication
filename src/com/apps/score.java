package com.apps;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class score extends JFrame implements ActionListener{

    JButton l4;

    score(String username, int score){
        getContentPane().setBackground(Color.WHITE);
        setBounds(280,200,800,400);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("com/apps/icons/score.png"));
        JLabel l1 = new JLabel(i1);
        l1.setBounds(50,100,350,200);
        add(l1);

        JLabel l2 = new JLabel("Thank You "+ username +" for playing Quiz!");
        l2.setBounds(50,10,600,50);
        l2.setFont(new Font("Droid Serif",Font.PLAIN,25));
        add(l2);

        JLabel l3 = new JLabel("You Scored "+score);
        l3.setBounds(550,50,500,100);
        l3.setFont(new Font("Segoe Print",Font.BOLD,30));
        l3.setForeground(new Color(105,63,156));
        add(l3);

        l4 = new JButton("Play Again!");
        l4.setBounds(550,150,120,30);
        l4.setBackground(new Color(50,150,207));
        l4.setForeground(Color.WHITE);
        l4.addActionListener(this);
        add(l4);
    }
    public void actionPerformed(ActionEvent a){
        if(a.getSource() == l4){
            this.setVisible(false);
            new FrontPage().setVisible(true);
        }
    }
    public static void main(String[] args) {
        new score("",0).setVisible(true);
    }
}
