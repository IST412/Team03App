
package team03app;

import java.awt.event.*;
import javax.swing.*;

public class TimeUI extends JFrame implements ActionListener {
 
    private final JButton back;
    private final Time time;
    private final TimeCntl theTimeCntl;
    
    public TimeUI(TimeCntl theTimeCntl){
        this.theTimeCntl = theTimeCntl;
        this.time = new Time();
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setLayout(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        back = new JButton("< Back");
        back.setBounds(50, 50, 100, 50);
        back.addActionListener(this);
        this.add(back);
        

    }
    
    public void actionPerformed(ActionEvent e){
      String action = e.getActionCommand();
        if (action.equals("< Back")) {
            theTimeCntl.hideTimeUI();
            theTimeCntl.theMainMenuCntl.showMain();
        }  
    }
}
