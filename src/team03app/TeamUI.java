/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package team03app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 *
 * @author Cody
 */
public class TeamUI extends JFrame implements ActionListener {

    private final JButton back;
    private final JTextArea information = new JTextArea("");
    private final Team team;
    TeamCntl theTeamCntl;

    public TeamUI(TeamCntl theTeamCntl) {
        this.theTeamCntl = theTeamCntl;
        this.team = new Team();
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setLayout(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        back = new JButton("< Back");
        back.setBounds(50, 50, 100, 50);
        back.addActionListener(this);
        this.add(back);
        
        for (String info : team.info) {
            information.append(info + "\n");
        }
        information.setBounds(200, 200, 200, 200);
        this.add(information);
        
    }

    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
        if (action.equals("< Back")) {
            theTeamCntl.hideTeamUI();
            theTeamCntl.theMainMenuCntl.showMain();
        }

    }

}
