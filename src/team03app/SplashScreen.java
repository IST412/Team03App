/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package team03app;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Cody
 */
public class SplashScreen extends JFrame {
    private JPanel imagePanel = new JPanel();
    private JLabel imageLabel = new JLabel();
    private JLabel textLabel = new JLabel("Team 3 Group App");
    
    private ImageIcon theSplashImage;
    
    public SplashScreen(){
        
        this.initCustomComponents();
        this.setSize(400, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public void initCustomComponents(){
        
        theSplashImage = new ImageIcon("Splash.jpg");
        imageLabel.setIcon(theSplashImage);
        imagePanel.add(imageLabel);
        imagePanel.add(textLabel);
        this.getContentPane().add(imagePanel);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
}
