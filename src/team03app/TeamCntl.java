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
    
    MainMenuCntl theMainMenuCntl;
    
    public TeamCntl(MainMenuCntl theMainMenuCntl){
        this.theMainMenuCntl = theMainMenuCntl;
        this.showTeamUI();
        theMainMenuCntl.hideMain();
    }
    
    public void showTeamUI(){
        TeamUI theTeamUI = new TeamUI(this);
        theTeamUI.setVisible(true);
    }
    
    public void hideTeamUI() {
        TeamUI theTeamUI = new TeamUI(this);
        theTeamUI.setVisible(false);
    }
    
    public void showMain(){
        theMainMenuCntl.showMain();
    }
    
}
