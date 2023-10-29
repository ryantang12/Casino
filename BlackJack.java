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
import javax.swing.border.Border;
import java.awt.BorderLayout;

public class BlackJack extends JFrame{
    JLabel userScoreText = new JLabel("player total: ", SwingConstants.CENTER);
    JLabel dealerScoreText = new JLabel("dealer total: ?", SwingConstants.CENTER);
    int userScoreValue;
    int dealerScoreValue;
    JLabel dealerCards = new JLabel();
    JPanel EncapsulateCard = new JPanel();
    
    //   when you click the blackjack button, populate the stack with files of random cards, 
    //   getRandomCard will pop from the stack and return the random card
    //   Stack<File>
    
    public static String getRandomCard(){
        Random obj = new Random();
        File folder = new File("/Users/ryan/Library/Mobile Documents/com~apple~CloudDocs/School/Computer Science HL/Ryan's IA/Card Folder/");
        File[] file = folder.listFiles();
        int random_card = obj.nextInt(51) + 1;

        Stack<File> card_folder = new Stack<File>();
        while(card_folder.isEmpty() == true){
            card_folder.push(file[random_card]);
            if(card_folder.size() <= 52){
                break;
            }
        }
        return card_folder.peek().getName();
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
        Image new_image = image.getScaledInstance(60, 60, java.awt.Image.SCALE_SMOOTH);

        JPanel EncapsulateCard = new JPanel();
        EncapsulateCard.add(new JLabel(new ImageIcon(new_image)));

        return EncapsulateCard;
    }

    public JPanel make_BlackJack_player(JPanel window){
        userScoreText.setFont(new Font("Times New Roman", Font.PLAIN, 28));
        JPanel SubPanel = new JPanel();
        SubPanel.setBorder(BorderFactory.createLineBorder(Color.black));
        SubPanel.setLayout(new GridLayout(2, 1));

        //creates win/lose
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3,1));
        JLabel win = new JLabel();
        JLabel lose = new JLabel();
        JLabel money_box = new JLabel();

        panel.add(win);
        panel.add(lose);
        panel.add(money_box);

        //creates AI
        JPanel AI_panel = new JPanel();
        JLabel AI = new JLabel("AI tips and tricks", SwingConstants.CENTER); 
        AI_panel.add(AI);

        //creates card box
        JPanel card_box = new JPanel();
        card_box.setBorder(BorderFactory.createLineBorder(Color.blue,1,true));
        card_box.setLayout(new FlowLayout());

        //button for user to draw 2 cards initially
        JButton start_game = new JButton("start");
        start_game.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        start_game.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    timestop(1000);
                    card_box.add(rollImage("player")); 
                    card_box.add(rollImage("player"));
                    window.revalidate(); 
                    window.repaint();

                    if(userScoreValue == 21){
                        casino.money = casino.money + 1;
                        win.setText("you win");
                        money_box.setText("this is your money: " + casino.money);
                    }else if(userScoreValue > 21){
                        casino.money = casino.money - 2;
                        lose.setText("you lose");
                        AI.setText("i knew you shouldn't have hit :(");
                        money_box.setText("this is your money: " + casino.money);
                    }else if(userScoreValue <= 17){
                        AI.setText("you can still hit, but you should stay :)"); 
                    }
                }
            });

        //creates button_box
        JPanel button_box = new JPanel();
        button_box.setBorder(BorderFactory.createLineBorder(Color.blue));
        button_box.setLayout(new GridLayout(2,4));

        JButton hit = new JButton("hit");
        hit.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        hit.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    timestop(1000);
                    card_box.add(rollImage("player")); 
                    window.revalidate(); 
                    window.repaint();

                    if(userScoreValue == 21){
                        casino.money = casino.money + 1;
                        win.setText("you win");
                        money_box.setText("this is your money: " + casino.money);
                    }else if(userScoreValue > 21){
                        casino.money = casino.money - 2;
                        lose.setText("you lose");
                        money_box.setText("this is your money: " + casino.money);
                        AI.setText("i knew you shouldn't have hit :(");
                    }else if(userScoreValue <= 17){
                        AI.setText("you can still hit, but you should stay :)"); 
                    }
                }
            });

        JButton stay = new JButton("stay");
        stay.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        stay.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    //checks if user wins/losses
                    while(dealerScoreValue < 21){
                        if(dealerScoreValue >= 17){
                            if(dealerScoreValue < userScoreValue){
                                casino.money = casino.money + 1;
                                win.setText("you win");
                                money_box.setText("this is your money: " + casino.money); break;
                            }else if(userScoreValue == dealerScoreValue){
                                casino.money = casino.money - 2;
                                lose.setText("you lose");
                                money_box.setText("this is your money: " + casino.money); break;
                            }else if(userScoreValue < dealerScoreValue){
                                casino.money = casino.money - 2;
                                lose.setText("you lose");
                                money_box.setText("this is your money: " + casino.money); break;
                            }
                        }else if(dealerScoreValue < 17){
                            timestop(500);
                            dealerCards.add(rollImage("dealer"));
                            if(dealerScoreValue > 21){
                                casino.money = casino.money + 1;
                                win.setText("you win");
                                money_box.setText("this is your money: " + casino.money); break;
                            }else if (dealerScoreValue == 21){
                                casino.money = casino.money - 2;
                                lose.setText("you lose");
                                money_box.setText("this is your money: " + casino.money); break;
                            }
                        }
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
                    //removes cards
                    card_box.removeAll();
                    EncapsulateCard.removeAll();
                    window.revalidate();
                    window.repaint();

                    //resets score
                    userScoreValue = 0;
                    userScoreText.setText("total: " + userScoreValue);
                    dealerScoreValue = 0;
                    dealerScoreText.setText("dealer total: ? " + dealerScoreValue);

                    //removes win/loss text
                    win.setText(null);
                    lose.setText(null);
                    money_box.setText(null);

                    //removes AI tips after reseting game
                    AI.setText("tips and tricks from your local AI");

                    // //adds new cards
                    // card_box.add(rollImage("player"));
                    // card_box.add(rollImage("player"));
                }
            });        

        button_box.add(start_game);
        button_box.add(reset);
        button_box.add(hit);
        button_box.add(stay);

        SubPanel.add(card_box);
        SubPanel.add(userScoreText);
        SubPanel.add(button_box);
        SubPanel.add(panel);
        SubPanel.add(AI_panel);

        return SubPanel;
    }

    public JPanel make_BlackJack_dealer(JPanel window){
        dealerScoreText.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createLineBorder(Color.red));
        panel.setLayout(new GridLayout(2, 1));

        JLabel gameTitle = new JLabel("blackjack", SwingConstants.CENTER);
        gameTitle.setFont(new Font("Times New Roman", Font.BOLD, 28));
        gameTitle.setBorder(BorderFactory.createLineBorder(Color.blue));

        JPanel dealer_score_and_cards = new JPanel();
        dealer_score_and_cards.setLayout(new GridLayout(1, 2));

        dealerCards.setBorder(BorderFactory.createLineBorder(Color.blue));
        dealerCards.setLayout(new FlowLayout());

        BufferedImage myPicture = null;
        try{
            myPicture = ImageIO.read(new File("Back Of Card.png"));
        }catch(java.io.IOException ioe){
            ioe.printStackTrace();
        }
        ImageIcon imageIcon = new ImageIcon(myPicture);
        Image image = imageIcon.getImage();
        Image new_image = image.getScaledInstance(60, 60, java.awt.Image.SCALE_SMOOTH);

        
        EncapsulateCard.setLayout(new FlowLayout());
        EncapsulateCard.add(new JLabel(new ImageIcon(new_image)));

        dealerCards.add(EncapsulateCard);
        dealerCards.add(rollImage("dealer"));
        rollImage("dealer");

        dealer_score_and_cards.add(dealerScoreText);
        dealer_score_and_cards.add(dealerCards);

        panel.add(gameTitle);
        panel.add(dealer_score_and_cards);
        return panel;
    }

    public void timestop(int x){
        try{
            Thread.sleep(x);
        } catch (Exception e){
            System.out.println("Error");
        }
    }
}