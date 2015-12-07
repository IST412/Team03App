/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package team03app;

import java.awt.Insets;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author Cody
 */
public class BarUI extends JFrame implements ActionListener{
    
    private final JButton back;
    private final JButton getBar;
    private final JTextArea displayBar;
    private final BarCntl theBarCntl;
    private final Bar newBar;
    private final JPanel newPanel;
    private String randomBar;
    
    
    public BarUI(BarCntl theBarCntl){
        this.theBarCntl = theBarCntl;
        this.newBar = new Bar();
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        newPanel = new JPanel();
        
        back = new JButton("< Back");
        back.setBounds(50, 50, 100, 50);
        back.addActionListener(this);
        newPanel.add(back);
        
        
        getBar = new JButton("Get Bar");
        getBar.setBounds(50, 50, 100, 50);
        getBar.addActionListener(this);
        newPanel.add(getBar);
        
        displayBar = new JTextArea("Press 'Get Bar'");
        displayBar.setMargin(new Insets(10,10,10,50));
        displayBar.setEditable(false);
        newPanel.add(displayBar);
        
        this.add(newPanel);
        
    }


 
      public void actionPerformed(ActionEvent e){
      String action = e.getActionCommand();
        if (action.equals("< Back")) 
        {
            theBarCntl.hideBarUI();
            theBarCntl.theMainMenuCntl.showMain();
        }
        
        if (action.equals("Get Bar"));
        {
            randomBar = theBarCntl.randomBar();
            System.out.println(randomBar);
            displayBar.setText(randomBar);
        }
        
    }
    
}
