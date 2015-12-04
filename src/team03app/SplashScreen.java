/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package team03app;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;


/**
 *
 * @author Cody
 */
public class SplashScreen extends JFrame {

    private JPanel imagePanel = new JPanel();
    private JLabel imageLabel = new JLabel();
    private JPanel textPanel = new JPanel();
    private JLabel textLabel = new JLabel("Team 3 Group App");
    
    private ImageIcon theSplashImage;
    
    public SplashScreen(){
        this.setLayout( new BorderLayout());
        this.initCustomComponents();
        this.setSize(400, 300);
        this.setLocationRelativeTo(null);
  
    }
    
    public void initCustomComponents(){
        
        theSplashImage = new ImageIcon("JavaBeer.png");
        textLabel.setFont(textLabel.getFont().deriveFont(18.0f));
        imageLabel.setIcon(theSplashImage);
        imagePanel.add(imageLabel);
        textPanel.add(textLabel);
        this.add(textPanel, BorderLayout.NORTH);
        this.add(imagePanel, BorderLayout.CENTER);
        this.setResizable(false);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
    }
}
