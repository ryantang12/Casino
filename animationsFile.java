import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JFrame;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.awt.Dimension;
import java.awt.Image;

public class animationsFile{
    public AnimatedIcon icon2;
    //https://tips4java.wordpress.com/2009/06/21/animated-icon/
    public JLabel animatedLoadingDots(){
        JLabel label2 = new JLabel();
        label2.setHorizontalTextPosition( JLabel.LEADING );
        icon2 = new AnimatedIcon( label2 );
        icon2.setAlignmentX( AnimatedIcon.LEFT );
        icon2.addIcon( new TextIcon(label2, ".") );
        icon2.addIcon( new TextIcon(label2, "..") );
        icon2.addIcon( new TextIcon(label2, "...") );
        icon2.addIcon( new TextIcon(label2, "....") );
        icon2.addIcon( new TextIcon(label2, ".....") );
        label2.setIcon( icon2 );
        return label2;
    }

    //https://stackoverflow.com/a/15166657
    public JLabel loadingLabel() {
        ClassLoader cldr = this.getClass().getClassLoader();
        ImageIcon imageIcon = new ImageIcon(cldr.getResource("spinner.gif"));

        JLabel labelObj = new JLabel(imageIcon);
        imageIcon.setImageObserver(labelObj);

        return labelObj;
    }

    public void main(){
        JFrame obj = new JFrame();

        obj.add(animatedLoadingDots());
        icon2.start();

        obj.setSize(new Dimension(40, 40));
        obj.setVisible(true);
    }
}