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

public class Welcome extends JFrame{
    public JPanel make_welcome_screen(JPanel window){
        JPanel SubPanel = new JPanel();
        SubPanel.setLayout(new GridLayout(4,1));
        SubPanel.setBorder(BorderFactory.createLineBorder(Color.black));
        
        JLabel welcome_screen = new JLabel("Welcome to my casino!", SwingConstants.CENTER);
        welcome_screen.setFont(new Font("Times New Roman", Font.BOLD, 40));
        
        JLabel game_picker = new JLabel("Choose any game you would like to play!", SwingConstants.CENTER);
        game_picker.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        
        JLabel directions = new JLabel("Directions: By selecting one of the buttons below, you will be directed to that game, have fun gambling, but not too much fun!", SwingConstants.CENTER);
        directions.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        
        JLabel reminders = new JLabel("Reminders: Gabmbling can create an addiction, so in order to be mindful, you will only start with 30 dollars", SwingConstants.CENTER);
        
        SubPanel.add(welcome_screen);
        SubPanel.add(game_picker);
        SubPanel.add(directions);
        SubPanel.add(reminders);
               
        return SubPanel;
    }
}