
package team03app;

public final class TeamCntl {
    
    public final MainMenuCntl theMainMenuCntl;
    TeamUI theTeamUI = new TeamUI(this);
    
    public TeamCntl(MainMenuCntl theMainMenuCntl){
        this.theMainMenuCntl = theMainMenuCntl;
        this.showTeamUI();
        theMainMenuCntl.hideMain();
    }
    
    public void showTeamUI(){
        theTeamUI.setVisible(true);
    }
    
    public void hideTeamUI() {
        theTeamUI.setVisible(false);
    }
    
    public void showMain(){
        theMainMenuCntl.showMain();
    }  
}
