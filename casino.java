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
public class casino extends JFrame{
    private static JPanel cardPanel, welcome_screen, game1, game2, game3, game4, buttonPanel;
    private JLabel jl1, jl2, jl3, jl4;
    private JButton btn0, btn1, btn2, btn3, btn4;
    private CardLayout cardLayout = new CardLayout();
    static int money;

    double width = 1000;
    double height = 600;
    public casino(){
        money = 30;

        setTitle("casino");
        setSize((int)width, (int)height);
        buttonPanel = new JPanel();
        cardPanel = new JPanel();
        cardPanel.setLayout(cardLayout);

        welcome_screen = new JPanel();
        game1 = new JPanel();
        game2 = new JPanel();
        game3 = new JPanel();
        game4 = new JPanel();

        cardPanel.add(welcome_screen, "0");
        cardPanel.add(game1, "1");
        cardPanel.add(game2, "2");
        cardPanel.add(game3, "3");
        cardPanel.add(game4, "4");

        //adds welcome screen
        Welcome welcome_obj = new Welcome();
        welcome_screen.add(welcome_obj.make_welcome_screen(welcome_screen));

        //adds roulette
        Roulette roulette_obj = new Roulette();
        game1.add(roulette_obj.make_roulette(game1));

        //adds blackjack
        BlackJack blackjack_obj = new BlackJack();
        game2.setLayout(new GridLayout(2,1));
        game2.add(blackjack_obj.make_BlackJack_player(game2));
        game2.add(blackjack_obj.make_BlackJack_dealer(game2));

        //adds slots
        Slots slots_obj = new Slots();
        game3.setLayout(new GridLayout(2,1));
        game3.add(slots_obj.make_slots(game3));

        //adds poker
        Shop shop_obj = new Shop();
        game4.setLayout(new GridLayout(1,2));
        game4.add(shop_obj.make_shop(game4));

        btn0 = new JButton("welcome screen");
        btn0.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    cardLayout.show(cardPanel, "0");
                    buttonPanel.remove(btn0);
                    buttonPanel.revalidate();
                    buttonPanel.repaint();
                }
            });

        //Roulette
        btn1 = new JButton("Roulette");
        btn1.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    cardLayout.show(cardPanel, "1");
                    buttonPanel.remove(btn0);
                    buttonPanel.revalidate();
                    buttonPanel.repaint();
                }
            });

        //BlackJack
        btn2 = new JButton("BlackJack");
        btn2.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    cardLayout.show(cardPanel, "2");
                    buttonPanel.remove(btn0);
                    buttonPanel.revalidate();
                    buttonPanel.repaint();
                }
            });

        //Slots
        btn3 = new JButton("Slots");
        btn3.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    cardLayout.show(cardPanel, "3");
                    buttonPanel.remove(btn0);
                    buttonPanel.revalidate();
                    buttonPanel.repaint();
                }
            });

        //Shop
        btn4 = new JButton("Shop");
        btn4.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    cardLayout.show(cardPanel, "4");
                    buttonPanel.remove(btn0);
                    buttonPanel.revalidate();
                    buttonPanel.repaint();
                }
            });

        buttonPanel.add(btn0);
        buttonPanel.add(btn1);
        buttonPanel.add(btn2);
        buttonPanel.add(btn3);
        buttonPanel.add(btn4);

        add(cardPanel, BorderLayout.NORTH);
        cardPanel.setPreferredSize(new Dimension((int)width,(int)(height*(4.0/5.0))));
        add(buttonPanel, BorderLayout.SOUTH);
        setResizable(false);
    }

    public static void main(String[] args){
        EventQueue.invokeLater(new Runnable(){
                @Override
                public void run(){
                    casino frame = new casino();
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setVisible(true);
                }
            });
    }
}