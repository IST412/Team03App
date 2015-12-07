/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package team03app;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Cody
 */
public class MainMenuUI extends JFrame implements ActionListener{
    
    GridLayout MainMenuLayout = new GridLayout(0,2);
    MainMenuCntl theMainMenuCntl;
    
    public MainMenuUI(MainMenuCntl theMainMenuCntl){
        this.theMainMenuCntl = theMainMenuCntl;
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setLayout(MainMenuLayout);
        JButton socialZone = new JButton("Social Zone");
        JButton timeManagementZone = new JButton("Time Management Zone");
        JButton assignmentZone = new JButton("Assignment Zone");
        JButton teamInformationZone = new JButton("Team Information Zone");
        socialZone.addActionListener(this);
        timeManagementZone.addActionListener(this);
        assignmentZone.addActionListener(this);
        teamInformationZone.addActionListener(this);
        this.add(socialZone);
        //this.add(timeManagementZone);
        this.add(assignmentZone);
        this.add(teamInformationZone);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    }
    
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
        if(action.equals("Social Zone")){
            BarCntl theBarCntl = new BarCntl(theMainMenuCntl);
        }
        if(action.equals("Time Management Zone")){
            TimeCntl theTimeCntl = new TimeCntl(theMainMenuCntl);
        }
        if(action.equals("Assignment Zone")){
            AssignCntl theAssignCntl = new AssignCntl(theMainMenuCntl);
        }
        if(action.equals("Team Information Zone")){
            TeamCntl theTeamCntl = new TeamCntl(theMainMenuCntl);
        }
    }
    
}
