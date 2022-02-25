package com.apps;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rules extends JFrame implements ActionListener {
    JButton b1,b2;
    String username;
    Rules(String username){
        this.username = username;
        setBounds(500,100,700,500);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        //Welcoming User.
        JLabel l1 = new JLabel("Welcome "+username+" to the Quiz Time!");
        l1.setForeground(new Color(30,144,255));
        l1.setFont(new Font("Segoe Print",Font.BOLD,20));
        l1.setBounds(10,0,600,50);
        add(l1);

        //Rules for the Quiz.
        JLabel l2 = new JLabel("");
        l2.setBounds(5,20,600,400);
        l2.setText(
                "<html>"+
                        "1. You are trained to be a programmer and not a story teller, answer point to point" + "<br><br>" +
                        "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer" + "<br><br>" +
                        "3. You may have lot of options in life but here all the questions are compulsory" + "<br><br>" +
                        "4. Crying is allowed but please do so quietly." + "<br><br>" +
                        "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
                        "6. Do not get nervous if your friend is answering more questions, may be he/she is doing Jai Mata Di" + "<br><br>" +
                        "7. Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
                        "8. May you know more than what John Snow knows, Good Luck" + "<br><br>" +
                "</html>"
        );
        add(l2);

        b1  = new JButton("Back");
        b1.setBounds(100,400,80,25);
        b1.addActionListener(this);
        add(b1);

        b2  = new JButton("Start");
        b2.setBounds(400,400,80,25);
        b2.addActionListener(this);
        add(b2);

        setVisible(true);

    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
            this.setVisible(false);
            new FrontPage().setVisible(true);
        }else if(e.getSource() == b2){
            this.setVisible(false);
            new Quiz(username).setVisible(true);
        }
    }
    public static void main(String[] args) {
        new Rules("");
    }
}
