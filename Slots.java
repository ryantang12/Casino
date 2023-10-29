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
import java.io.IOException;

public class Slots extends JPanel{
    public AnimatedIcon icon1; public AnimatedIcon icon2; public AnimatedIcon icon3; public AnimatedIcon icon4; public AnimatedIcon icon5;
    public AnimatedIcon icon6; public AnimatedIcon icon7; public AnimatedIcon icon8; public AnimatedIcon icon9;
    ArrayList<AnimatedIcon> list_of_slots = new ArrayList<AnimatedIcon>();

    //https://tips4java.wordpress.com/2009/06/21/animated-icon/
    public JLabel Slot1(){
        JLabel label1 = new JLabel();

        label1.setHorizontalTextPosition( JLabel.LEADING );
        icon1 = new AnimatedIcon( label1 );
        icon1.setAlignmentX( AnimatedIcon.LEFT );
        icon1.addIcon( new TextIcon(label1, "!") );
        icon1.addIcon( new TextIcon(label1, "@") );
        icon1.addIcon( new TextIcon(label1, "#") );
        icon1.addIcon( new TextIcon(label1, "$") );
        icon1.addIcon( new TextIcon(label1, "%") );
        icon1.addIcon( new TextIcon(label1, "^") );
        icon1.addIcon( new TextIcon(label1, "&") );
        label1.setIcon( icon1 );

        return label1;
    }

    public JLabel Slot2(){
        JLabel label2 = new JLabel();

        label2.setHorizontalTextPosition( JLabel.LEADING );
        icon2 = new AnimatedIcon( label2 );
        icon2.setAlignmentX( AnimatedIcon.LEFT );
        icon2.addIcon( new TextIcon(label2, "!") );
        icon2.addIcon( new TextIcon(label2, "@") );
        icon2.addIcon( new TextIcon(label2, "#") );
        icon2.addIcon( new TextIcon(label2, "$") );
        icon2.addIcon( new TextIcon(label2, "%") );
        icon2.addIcon( new TextIcon(label2, "^") );
        icon2.addIcon( new TextIcon(label2, "&") );
        label2.setIcon( icon2 );
        return label2;
    }

    public JLabel Slot3(){
        JLabel label3 = new JLabel();

        label3.setHorizontalTextPosition( JLabel.LEADING );
        icon3 = new AnimatedIcon( label3 );
        icon3.setAlignmentX( AnimatedIcon.LEFT );
        icon3.addIcon( new TextIcon(label3, "!") );
        icon3.addIcon( new TextIcon(label3, "@") );
        icon3.addIcon( new TextIcon(label3, "#") );
        icon3.addIcon( new TextIcon(label3, "$") );
        icon3.addIcon( new TextIcon(label3, "%") );
        icon3.addIcon( new TextIcon(label3, "^") );
        icon3.addIcon( new TextIcon(label3, "&") );
        label3.setIcon( icon3 );
        return label3;
    }

    public JLabel Slot4(){
        JLabel label4 = new JLabel();

        label4.setHorizontalTextPosition( JLabel.LEADING );
        icon4 = new AnimatedIcon( label4 );
        icon4.setAlignmentX( AnimatedIcon.LEFT );
        icon4.addIcon( new TextIcon(label4, "!") );
        icon4.addIcon( new TextIcon(label4, "@") );
        icon4.addIcon( new TextIcon(label4, "#") );
        icon4.addIcon( new TextIcon(label4, "$") );
        icon4.addIcon( new TextIcon(label4, "%") );
        icon4.addIcon( new TextIcon(label4, "^") );
        icon4.addIcon( new TextIcon(label4, "&") );
        label4.setIcon( icon4 );

        return label4;
    }

    public JLabel Slot5(){
        JLabel label5 = new JLabel();

        label5.setHorizontalTextPosition( JLabel.LEADING );
        icon5 = new AnimatedIcon( label5 );
        icon5.setAlignmentX( AnimatedIcon.LEFT );
        icon5.addIcon( new TextIcon(label5, "!") );
        icon5.addIcon( new TextIcon(label5, "@") );
        icon5.addIcon( new TextIcon(label5, "#") );
        icon5.addIcon( new TextIcon(label5, "$") );
        icon5.addIcon( new TextIcon(label5, "%") );
        icon5.addIcon( new TextIcon(label5, "^") );
        icon5.addIcon( new TextIcon(label5, "&") );
        label5.setIcon( icon5 );

        return label5;
    }

    public JLabel Slot6(){
        JLabel label6 = new JLabel();

        label6.setHorizontalTextPosition( JLabel.LEADING );
        icon6 = new AnimatedIcon( label6 );
        icon6.setAlignmentX( AnimatedIcon.LEFT );
        icon6.addIcon( new TextIcon(label6, "!") );
        icon6.addIcon( new TextIcon(label6, "@") );
        icon6.addIcon( new TextIcon(label6, "#") );
        icon6.addIcon( new TextIcon(label6, "$") );
        icon6.addIcon( new TextIcon(label6, "%") );
        icon6.addIcon( new TextIcon(label6, "^") );
        icon6.addIcon( new TextIcon(label6, "&") );
        label6.setIcon( icon6 );

        return label6;
    }

    public JLabel Slot7(){
        JLabel label7 = new JLabel();

        label7.setHorizontalTextPosition( JLabel.CENTER );
        icon7 = new AnimatedIcon( label7 );
        icon7.setAlignmentX( AnimatedIcon.LEFT );
        icon7.addIcon( new TextIcon(label7, "!") );
        icon7.addIcon( new TextIcon(label7, "@") );
        icon7.addIcon( new TextIcon(label7, "#") );
        icon7.addIcon( new TextIcon(label7, "$") );
        icon7.addIcon( new TextIcon(label7, "%") );
        icon7.addIcon( new TextIcon(label7, "^") );
        icon7.addIcon( new TextIcon(label7, "&") );
        label7.setIcon( icon7 );

        return label7;
    }

    public JLabel Slot8(){
        JLabel label8 = new JLabel();

        label8.setHorizontalTextPosition( JLabel.CENTER );
        icon8 = new AnimatedIcon( label8 );
        icon8.setAlignmentX( AnimatedIcon.LEFT );
        icon8.addIcon( new TextIcon(label8, "!") );
        icon8.addIcon( new TextIcon(label8, "@") );
        icon8.addIcon( new TextIcon(label8, "#") );
        icon8.addIcon( new TextIcon(label8, "$") );
        icon8.addIcon( new TextIcon(label8, "%") );
        icon8.addIcon( new TextIcon(label8, "^") );
        icon8.addIcon( new TextIcon(label8, "&") );
        label8.setIcon( icon8 );

        return label8;
    }

    public JLabel Slot9(){
        JLabel label9 = new JLabel();

        label9.setHorizontalTextPosition( JLabel.LEADING );
        icon9 = new AnimatedIcon( label9 );
        icon9.setAlignmentX( AnimatedIcon.LEFT );
        icon9.addIcon( new TextIcon(label9, "!") );
        icon9.addIcon( new TextIcon(label9, "@") );
        icon9.addIcon( new TextIcon(label9, "#") );
        icon9.addIcon( new TextIcon(label9, "$") );
        icon9.addIcon( new TextIcon(label9, "%") );
        icon9.addIcon( new TextIcon(label9, "^") );
        icon9.addIcon( new TextIcon(label9, "&") );
        label9.setIcon( icon9 );

        return label9;
    }

    protected ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = getClass().getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }

    public JPanel make_slots(JPanel window){
        JPanel subPanel = new JPanel();
        subPanel.setLayout(new GridLayout(1,2));
        subPanel.setBorder(BorderFactory.createLineBorder(Color.blue));

        //adds 9 animated slot things
        JPanel slot_holder = new JPanel();
        slot_holder.setLayout(new GridLayout(3,3));
        slot_holder.setBorder(BorderFactory.createLineBorder(Color.yellow));

        slot_holder.add(Slot1(), SwingConstants.CENTER); slot_holder.add(Slot2(), SwingConstants.CENTER); slot_holder.add(Slot3(), SwingConstants.CENTER);
        slot_holder.add(Slot4(), SwingConstants.CENTER); slot_holder.add(Slot5(), SwingConstants.CENTER); slot_holder.add(Slot6(), SwingConstants.CENTER);
        slot_holder.add(Slot7(), SwingConstants.CENTER); slot_holder.add(Slot8(), SwingConstants.CENTER); slot_holder.add(Slot9(), SwingConstants.CENTER);

        //creates JLabel for slot numbers after spinning
        JLabel slot1 = new JLabel(); JLabel slot2 = new JLabel(); JLabel slot3 = new JLabel(); JLabel slot4 = new JLabel(); JLabel slot5 = new JLabel();
        JLabel slot6 = new JLabel(); JLabel slot7 = new JLabel(); JLabel slot8 = new JLabel(); JLabel slot9 = new JLabel();

        JPanel slot_result = new JPanel();
        slot_result.add(slot1); slot_result.add(slot2); slot_result.add(slot3); slot_result.add(slot4); slot_result.add(slot5);
        slot_result.add(slot6); slot_result.add(slot7); slot_result.add(slot8); slot_result.add(slot9);

        //creates JLabel for slot text
        JLabel slot_welcome = new JLabel("welcome to slots",SwingConstants.CENTER);

        //creates JPanel for spin and stop buttons
        JPanel button_box = new JPanel();
        button_box.setLayout(new GridLayout(4,1));
        button_box.setBorder(BorderFactory.createLineBorder(Color.orange));

        //creates JLabel for matching slot things
        JPanel panel_for_matching = new JPanel();
        panel_for_matching.setLayout(new GridLayout(3,1));
        panel_for_matching.setBorder(BorderFactory.createLineBorder(Color.green));
        JLabel match_none = new JLabel("", SwingConstants.CENTER);
        JLabel match_three = new JLabel("", SwingConstants.CENTER);
        JLabel money_box = new JLabel("", SwingConstants.CENTER);

        JButton start_animation = new JButton("spin");
        start_animation.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        start_animation.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    Random obj = new Random();
                    int random1 = obj.nextInt(50) + 50; list_of_slots.add(icon1); icon1.start(); icon1.setDelay(random1);
                    int random2 = obj.nextInt(50) + 50; list_of_slots.add(icon2); icon2.start(); icon2.setDelay(random2);
                    int random3 = obj.nextInt(50) + 50; list_of_slots.add(icon3); icon3.start(); icon3.setDelay(random3);
                    int random4 = obj.nextInt(50) + 50; list_of_slots.add(icon4); icon4.start(); icon4.setDelay(random4);
                    int random5 = obj.nextInt(50) + 50; list_of_slots.add(icon5); icon5.start(); icon5.setDelay(random5);
                    int random6 = obj.nextInt(50) + 50; list_of_slots.add(icon6); icon6.start(); icon6.setDelay(random6);
                    int random7 = obj.nextInt(50) + 50; list_of_slots.add(icon7); icon7.start(); icon7.setDelay(random7);                    
                    int random8 = obj.nextInt(50) + 50; list_of_slots.add(icon8); icon8.start(); icon8.setDelay(random8);                    
                    int random9 = obj.nextInt(50) + 50; list_of_slots.add(icon9); icon9.start(); icon9.setDelay(random9);
                }
            });  

        Random obj = new Random();
        int random_delay = obj.nextInt(1000) + 1000;

        JButton stop_animation = new JButton("stop");
        stop_animation.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        stop_animation.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    icon1.stop(); slot1.setText(String.valueOf(icon1.getCurrentIconIndex() + 1));
                    icon2.stop(); slot2.setText(String.valueOf(icon2.getCurrentIconIndex() + 1));
                    icon3.stop(); slot3.setText(String.valueOf(icon3.getCurrentIconIndex() + 1));
                    icon4.stop(); slot4.setText(String.valueOf(icon4.getCurrentIconIndex() + 1));
                    icon5.stop(); slot5.setText(String.valueOf(icon5.getCurrentIconIndex() + 1));
                    icon6.stop(); slot6.setText(String.valueOf(icon6.getCurrentIconIndex() + 1));
                    icon7.stop(); slot7.setText(String.valueOf(icon7.getCurrentIconIndex() + 1));
                    icon8.stop(); slot8.setText(String.valueOf(icon8.getCurrentIconIndex() + 1));
                    icon9.stop(); slot9.setText(String.valueOf(icon9.getCurrentIconIndex() + 1));

                    if(slot1.getText().equals(slot2.getText()) && slot2.getText().equals(slot3.getText())){
                        casino.money = casino.money + 1;
                        match_three.setText("you matched three!");
                        money_box.setText("you now have this much money: " + casino.money);
                    }else if (slot4.getText().equals(slot5.getText()) && slot5.getText().equals(slot6.getText())){
                        casino.money = casino.money + 1;
                        match_three.setText("you matched three!");
                        money_box.setText("you now have this much money: " + casino.money);
                    }else if(slot7.getText().equals(slot8.getText()) && slot8.getText().equals(slot9.getText())){
                        casino.money = casino.money + 1;
                        match_three.setText("you matched three!");
                        money_box.setText("you now have this much money: " + casino.money);
                    }else if(slot1.getText().equals(slot4.getText()) && slot4.getText().equals(slot7.getText())){
                        casino.money = casino.money + 1;
                        match_three.setText("you matched three!");
                        money_box.setText("you now have this much money: " + casino.money);
                    }else if(slot2.getText().equals(slot5.getText()) && slot5.getText().equals(slot8.getText())){
                        casino.money = casino.money + 1;
                        match_three.setText("you matched three!");
                        money_box.setText("you now have this much money: " + casino.money);
                    }else if(slot3.getText().equals(slot6.getText()) && slot8.getText().equals(slot9.getText())){
                        casino.money = casino.money + 1;
                        match_three.setText("you matched three!"); 
                        money_box.setText("you now have this much money: " + casino.money);
                    }else{
                        casino.money = casino.money - 4;
                        match_none.setText("uh oh, you didn't match anything");
                        money_box.setText("you now have this much money: " + casino.money);
                        if(casino.money < 0){
                            match_none.setText("bye bye, you ran out of money, try again next time");
                            money_box.setText("you now have this much money: " + casino.money);
                            System.exit(1);
                        }
                    }
                    
                    window.revalidate();
                }
            });  

        JButton reset = new JButton("reset");
        reset.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        reset.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    match_none.setText(null);
                    match_three.setText(null);
                    money_box.setText(null);
                }
            });  

        panel_for_matching.add(match_none);
        panel_for_matching.add(match_three);
        panel_for_matching.add(money_box);

        button_box.add(start_animation);
        button_box.add(stop_animation);
        button_box.add(reset);

        //adds image for slots:
        // slot_maker slot_obj = new slot_maker();
        // subPanel.add(slot_obj.make_slots(subPanel));

        subPanel.add(slot_holder);
        subPanel.add(panel_for_matching);
        subPanel.add(slot_result);
        subPanel.add(button_box);

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