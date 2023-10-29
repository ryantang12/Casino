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
import javax.swing.JButton;
import java.io.IOException;

public class Poker extends JFrame{
    JLabel userScoreText = new JLabel("player total: ", SwingConstants.CENTER);
    JLabel dealerScoreText = new JLabel("dealer total: ", SwingConstants.CENTER);
    int userScoreValue;
    int dealerScoreValue;
    private static final long serialVersionUID = 1L;
    private JLabel handLabel; // Display for the player's hand
    private JButton betButton; // Button for betting
    private JButton foldButton; // Button for folding
    private JPanel buttonPanel; // Panel for holding the buttons
    public JPanel make_poker(JPanel window){
        // Set up the GUI
        setTitle("Poker Game");
        setLayout(new GridLayout(2, 1));
        JPanel SubPanel = new JPanel();

        // Create the label for displaying the player's hand
        handLabel = new JLabel("Your hand: ");
        
        // Create the button panel and add the buttons
        buttonPanel = new JPanel();
    
        // Create the Bet Button
        betButton = new JButton("Bet");
        betButton.setFont(new Font("Times New Roman", Font.PLAIN, 28));
        betButton.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    handLabel.add(rollImage("player")); 
                    window.revalidate(); 
                    window.repaint();
                }
            });
        
        //Create the Fold Button
        foldButton = new JButton("Fold");
        foldButton.setFont(new Font("Times New Roman", Font.PLAIN, 28));
        foldButton.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    handLabel.add(rollImage("player")); 
                    window.revalidate(); 
                    window.repaint();
                }
            });
        
        buttonPanel.add(betButton);
        buttonPanel.add(foldButton);
        SubPanel.add(buttonPanel);
        SubPanel.add(handLabel);
        
        setVisible(true);
        return SubPanel;
    }

    // @Override
    // public void actionPerformed(ActionEvent e) {
        // // Handle button clicks here
        // if (e.getSource() == betButton) {
            // // Betting logic goes here
        // } else if (e.getSource() == foldButton) {
            // // Folding logic goes here
        // }
    // }

    public static String getRandomCard(){
        Random obj = new Random();
        File folder = new File("/Users/ryan/Library/Mobile Documents/com~apple~CloudDocs/School/Computer Science HL/Ryan's IA/Card Folder/");
        File[] file = folder.listFiles();
        int random_card = obj.nextInt(51) + 1;
        return file[random_card].getName();
    }

    public int getValue(String someCard){
        if(someCard.contains("Jack") || someCard.contains("Queen") || someCard.contains("King") || someCard.contains("10")){
            return 10;
        }else if(someCard.contains("Ace")){
            return (userScoreValue + 11) > 21 ? 1 : 11;
        }else if(someCard.contains("2")){
            return 2;
        }else if(someCard.contains("3")){
            return 3;
        }else if(someCard.contains("4")){
            return 4;
        }else if(someCard.contains("5")){
            return 5;
        }else if(someCard.contains("6")){
            return 6;
        }else if(someCard.contains("7")){
            return 7;
        }else if(someCard.contains("8")){
            return 8;
        }else if(someCard.contains("9")){
            return 9;
        }else{
            return parseStringForValue(someCard);
        }
    }

    public int parseStringForValue(String someCard){
        return Integer.valueOf(someCard.charAt(0));
    }

    public JPanel rollImage(String user){
        BufferedImage myPicture = null;
        try{
            String randomCardName = getRandomCard();
            int valueOfRandomCard = getValue(randomCardName);
            myPicture = ImageIO.read(new File("/Users/ryan/Library/Mobile Documents/com~apple~CloudDocs/School/Computer Science HL/Ryan's IA/Card Folder/"+
                    randomCardName
                ));
            if(user.equals("player")){
                userScoreValue += valueOfRandomCard;
                userScoreText.setText("total: " + userScoreValue);
            }else if(user.equals("dealer")){
                dealerScoreValue += valueOfRandomCard;
                dealerScoreText.setText("dealer total: " + dealerScoreValue);
            }
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
        ImageIcon imageIcon = new ImageIcon(myPicture);
        Image image = imageIcon.getImage();
        Image newimg = image.getScaledInstance(60, 60, java.awt.Image.SCALE_SMOOTH);

        JPanel EncapsulateCard = new JPanel();
        EncapsulateCard.add(new JLabel(new ImageIcon(newimg)));

        return EncapsulateCard;
    }

    // public JPanel make_poker(JPanel window){
        // userScoreText.setFont(new Font("Times New Roman", Font.PLAIN, 28));
        // JPanel SubPanel = new JPanel();
        // SubPanel.setLayout(new GridLayout(2, 1));

        // JPanel card_box = new JPanel();
        // card_box.setLayout(new FlowLayout());
        // card_box.add(rollImage("player"));

        // JButton hit = new JButton("hit");
        // hit.setFont(new Font("Times New Roman", Font.PLAIN, 28));
        // hit.addActionListener(new ActionListener(){
                // @Override
                // public void actionPerformed(ActionEvent e){
                    // card_box.add(rollImage("player")); //Breaks the code.
                    // window.revalidate(); 
                    // window.repaint();
                // }
            // });

        // JButton stay = new JButton("stay");
        // stay.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        // stay.addActionListener(new ActionListener(){
                // @Override
                // public void actionPerformed(ActionEvent e){
                    // if(dealerScoreValue >= 17){
                        // if(userScoreValue == 21){

                        // }else if(dealerScoreValue > userScoreValue){

                        // }else if(dealerScoreValue == 21){

                        // }else if(dealerScoreValue < userScoreValue){

                        // }
                    // }else if(dealerScoreValue < 17){
                        // card_box.add(rollImage("dealer"));
                        // if(dealerScoreValue > 21){

                        // }else if (dealerScoreValue == 21){

                        // }
                    // }
                // }
            // });

        // JButton reset = new JButton("reset");
        // reset.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        // reset.addActionListener(new ActionListener(){
                // @Override
                // public void actionPerformed(ActionEvent e){
                    // card_box.removeAll();
                    // userScoreValue = 0;
                    // userScoreText.setText("total: " + userScoreValue);
                    // dealerScoreValue = 0;
                    // dealerScoreText.setText("dealer total: " + dealerScoreValue);
                // }
            // });        

        // JPanel button_box = new JPanel();
        // button_box.setLayout(new FlowLayout());
        // button_box.add(hit);
        // button_box.add(stay);
        // button_box.add(reset);

        // SubPanel.add(card_box);
        // SubPanel.add(userScoreText);
        // SubPanel.add(button_box);

        // return SubPanel;
        // // window.setLayout(new GridLayout(2, 1));
        // // window.add(SubPanel);
        // // return window;
    // }
}