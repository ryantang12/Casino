import java.awt.*;
import javax.swing.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.*;
import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JFrame;
import java.awt.image.BufferedImage;
import java.awt.Dimension;
import java.awt.Image;

public class Shop extends JFrame{
    public JPanel make_shop(JPanel window){
        int real_money = 0;

        JPanel color = new JPanel();
        color.setLayout(new GridLayout(4,1));
        color.setBorder(BorderFactory.createLineBorder(Color.black));

        JLabel welcome_screen = new JLabel("Welcome to the shop!", SwingConstants.CENTER);
        welcome_screen.setFont(new Font("Times New Roman", Font.BOLD, 40));

        JLabel game_picker = new JLabel("Would you like to buy a new background color?", SwingConstants.CENTER);
        game_picker.setFont(new Font("Times New Roman", Font.PLAIN, 18));

        JLabel buying = new JLabel("", SwingConstants.CENTER);
        buying.setFont(new Font("Times New Roman", Font.PLAIN, 15));

        JButton buy_money = new JButton("buy money");
        buy_money.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        buy_money.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    if(casino.money > 1){
                        casino.money = casino.money - 1;
                        buying.setText("nice, enjoy your purchase, money: " + real_money);
                    }else{
                        buying.setText("you are too broke, go back and win some more money!");
                    }
                }
            });  

        JButton buy_background = new JButton("buy background"); 
        buy_background.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        buy_background.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    if(casino.money > 10){
                        casino.money = casino.money - 10;
                        color.setBackground(Color.PINK);
                        buying.setText("nice, enjoy your new background");
                    }else{
                        buying.setText("you are too broke, go back and win some more money!");
                    }
                }
            });  

        color.add(welcome_screen);
        color.add(game_picker);
        color.add(buying);
        color.add(buy_background);

        return color;
    }
}