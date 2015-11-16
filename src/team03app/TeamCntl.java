/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package team03app;

/**
 *
 * @author Cody
 */
public class TeamCntl {
    
    public TeamCntl(MainMenuCntl theMainMenuCntl){
        this.showTeamUI();
        theMainMenuCntl.hideMain();
    }
    
    public void showTeamUI(){
        TeamUI theTeamUI = new TeamUI();
        theTeamUI.setVisible(true);
    }
    
}
