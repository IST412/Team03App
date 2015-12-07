/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package team03app;

import java.awt.BorderLayout;
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
    private final JPanel topPanel;
    private final JPanel centerPanel;
    private String randomBar;
    private boolean isVisible = false;
    
    
    public BarUI(BarCntl theBarCntl){
        this.theBarCntl = theBarCntl;
        this.newBar = new Bar();
        this.setSize(400, 300);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setLayout( new BorderLayout());
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        topPanel = new JPanel();
        centerPanel = new JPanel();
        
        back = new JButton("< Back");
        back.setBounds(50, 50, 100, 50);
        back.addActionListener(this);
        topPanel.add(back);
        
        
        getBar = new JButton("Get Bar");
        getBar.setBounds(50, 50, 100, 50);
        getBar.addActionListener(this);
        topPanel.add(getBar);
        
        displayBar = new JTextArea("Press 'Get Bar'");
        displayBar.setMargin(new Insets(20,20,20,50));
        displayBar.setFont(displayBar.getFont().deriveFont(18.0f));
        displayBar.setEditable(false);
        centerPanel.add(displayBar);

        this.add(topPanel, BorderLayout.NORTH);
        this.add(centerPanel, BorderLayout.CENTER);
    }
    
    public boolean frameVisible()
    {
        if(topPanel != null)
        {
            isVisible = true;
        }
        
        return isVisible;
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
