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

public class Roulette extends JPanel{
    public AnimatedIcon icon1;
    public AnimatedIcon icon2;
    private static JTextField bet_number = new JTextField(8);
    private static JTextField bet_color = new JTextField(8);
    private static JTextField even_or_odd = new JTextField(8);
    private static JTextField first_to_middle = new JTextField(8);
    //https://tips4java.wordpress.com/2009/06/21/animated-icon/
    public JLabel random_number(){
        JLabel label2 = new JLabel();
        label2.setHorizontalTextPosition( JLabel.LEADING );
        icon2 = new AnimatedIcon( label2 );
        icon2.setAlignmentX( AnimatedIcon.LEFT );
        icon2.addIcon( new TextIcon(label2, "0") );
        icon2.addIcon( new TextIcon(label2, "1") );
        icon2.addIcon( new TextIcon(label2, "2") );
        icon2.addIcon( new TextIcon(label2, "3") );
        icon2.addIcon( new TextIcon(label2, "4") );
        icon2.addIcon( new TextIcon(label2, "5") );
        icon2.addIcon( new TextIcon(label2, "6") );
        icon2.addIcon( new TextIcon(label2, "7") );
        icon2.addIcon( new TextIcon(label2, "8") );
        icon2.addIcon( new TextIcon(label2, "9") );
        icon2.addIcon( new TextIcon(label2, "10") );
        icon2.addIcon( new TextIcon(label2, "11") );
        icon2.addIcon( new TextIcon(label2, "12") );
        icon2.addIcon( new TextIcon(label2, "13") );
        icon2.addIcon( new TextIcon(label2, "14") );
        icon2.addIcon( new TextIcon(label2, "15") );
        icon2.addIcon( new TextIcon(label2, "16") );
        icon2.addIcon( new TextIcon(label2, "17") );
        icon2.addIcon( new TextIcon(label2, "18") );
        icon2.addIcon( new TextIcon(label2, "19") );
        icon2.addIcon( new TextIcon(label2, "20") );
        icon2.addIcon( new TextIcon(label2, "21") );
        icon2.addIcon( new TextIcon(label2, "22") );
        icon2.addIcon( new TextIcon(label2, "23") );
        icon2.addIcon( new TextIcon(label2, "24") );
        icon2.addIcon( new TextIcon(label2, "25") );
        icon2.addIcon( new TextIcon(label2, "26") );
        icon2.addIcon( new TextIcon(label2, "27") );
        icon2.addIcon( new TextIcon(label2, "28") );
        icon2.addIcon( new TextIcon(label2, "29") );
        icon2.addIcon( new TextIcon(label2, "30") );
        icon2.addIcon( new TextIcon(label2, "31") );
        icon2.addIcon( new TextIcon(label2, "32") );
        icon2.addIcon( new TextIcon(label2, "33") );
        icon2.addIcon( new TextIcon(label2, "34") );
        icon2.addIcon( new TextIcon(label2, "35") );
        icon2.addIcon( new TextIcon(label2, "36") );
        label2.setIcon( icon2 );
        return label2;
    }

    public JLabel random_color(){
        //add new animated icon for random color
        JLabel label1 = new JLabel();
        label1.setHorizontalTextPosition( JLabel.LEADING );
        icon1 = new AnimatedIcon( label1 );
        icon1.setAlignmentX( AnimatedIcon.LEFT );
        icon1.addIcon( new TextIcon(label1, "RED") );
        icon1.addIcon( new TextIcon(label1, "BLACK") );

        label1.setIcon( icon1 );
        return label1;
    }

    public JPanel make_roulette(JPanel window){
        JPanel subPanel = new JPanel();
        subPanel.setLayout(new GridLayout(4,1));

        JPanel rolling_box = new JPanel();
        rolling_box.setBorder(BorderFactory.createLineBorder(Color.black));
        rolling_box.add(random_number());
        rolling_box.add(random_color());

        JLabel number_slot = new JLabel("pick a number 1-36: ", SwingConstants.CENTER);
        JLabel color_slot = new JLabel("pick a color red or black: ", SwingConstants.CENTER);
        JLabel even_or_odd_slot = new JLabel("pick a side, even or odd", SwingConstants.CENTER);
        JLabel first_to_half_slot = new JLabel("pick a half, first or second", SwingConstants.CENTER);
        JLabel roulette_number = new JLabel();
        JLabel roulette_color = new JLabel();
        JLabel user_win = new JLabel();
        JLabel user_lose = new JLabel();

        JButton start_animation = new JButton("start");
        start_animation.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        start_animation.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    icon1.start();
                    icon1.setDelay(50);
                    icon2.start();
                    icon2.setDelay(9);
                }
            });  

        JButton stop_animation = new JButton("stop");
        stop_animation.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        stop_animation.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    String a = String.valueOf(icon2.getCurrentIconIndex());
                    roulette_number.setText(a);
                    icon2.stop();
                    icon1.stop();

                    if(icon1.getCurrentIconIndex()+1 == 1){
                        roulette_color.setText("red");
                    }else if(icon1.getCurrentIconIndex()+1 == 2){
                        roulette_color.setText("black");
                    }

                    if(bet_number.getText().equals(roulette_number.getText())){
                        casino.money = casino.money + 1;
                        user_win.setText("you win money, money: " + casino.money);
                    }else if(bet_color.getText().equals(roulette_color.getText())){
                        casino.money = casino.money + 1;
                        user_win.setText("you win money, money: " + casino.money);
                    }else if(Integer.parseInt(roulette_number.getText()) <= 18){
                        casino.money = casino.money + 1;
                        user_win.setText("you win money, money: " + casino.money);
                    }else if(Integer.parseInt(roulette_number.getText()) <= 36 && Integer.parseInt(roulette_number.getText()) >= 18 && first_to_middle.getText().equals("second")){
                        casino.money = casino.money + 1;
                        user_win.setText("you win money, money: " + casino.money);
                    }else if(Integer.parseInt(roulette_number.getText()) <= 18 && first_to_middle.getText().equals("first")){
                        casino.money = casino.money + 1;
                        user_win.setText("you win money, money: " + casino.money);
                    }else if(Integer.parseInt(roulette_number.getText()) % 2 == 0 && even_or_odd.getText().equals("even")){
                        casino.money = casino.money + 1;
                        user_win.setText("you win money, money: " + casino.money);
                    }else if(Integer.parseInt(roulette_number.getText()) % 2 != 0 && even_or_odd.getText().equals("odd")){
                        casino.money = casino.money + 1;
                        user_win.setText("you win money, money: " + casino.money);
                    }else{
                        casino.money = casino.money - 4;
                        user_lose.setText("you lose money, money: " + casino.money);
                    }
                    
                    if(casino.money < 0){
                        System.exit(1);
                    }
                }
            });   

        JButton reset = new JButton("reset");
        reset.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        reset.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    user_win.setText(null);
                    user_lose.setText(null);
                }
            });  

        JPanel panel_for_user_input = new JPanel();
        panel_for_user_input.setLayout(new GridLayout(4,4));
        panel_for_user_input.setBorder(BorderFactory.createLineBorder(Color.black));
        
        panel_for_user_input.add(even_or_odd_slot); 
        panel_for_user_input.add(even_or_odd);
        
        panel_for_user_input.add(first_to_half_slot);
        panel_for_user_input.add(first_to_middle);
        
        panel_for_user_input.add(number_slot);
        panel_for_user_input.add(bet_number);
        
        panel_for_user_input.add(color_slot);
        panel_for_user_input.add(bet_color);

        JPanel win_lose_panel = new JPanel();
        win_lose_panel.setBorder(BorderFactory.createLineBorder(Color.black));
        win_lose_panel.add(user_win);
        win_lose_panel.add(user_lose);

        JPanel panel_for_buttons = new JPanel();
        panel_for_buttons.setBorder(BorderFactory.createLineBorder(Color.black));
        panel_for_buttons.add(start_animation);
        panel_for_buttons.add(stop_animation);
        panel_for_buttons.add(reset);

        subPanel.add(rolling_box);
        subPanel.add(panel_for_buttons);
        subPanel.add(panel_for_user_input);
        subPanel.add(win_lose_panel);

        this.setSize(new Dimension(40, 40));
        this.setVisible(true);

        return subPanel;
    }

    public void timestop(int x){
        try{
            Thread.sleep(x);
        } catch (Exception e){
            System.out.println("Error");
        }
    }
}