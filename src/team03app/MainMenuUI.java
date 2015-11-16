/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package team03app;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Cody
 */
public class MainMenuUI extends JFrame{
    
    GridLayout MainMenuLayout = new GridLayout(0,2);
    
    public MainMenuUI(){
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLayout(MainMenuLayout);
        this.add(new JButton("Social Zone"));
        this.add(new JButton("Time Management Zone"));
        this.add(new JButton("Assignment Zone"));
        this.add(new JButton("Team Information Zone"));
    }
    
}
