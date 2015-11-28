
package team03app;

public final class TeamCntl {
    
    public final MainMenuCntl theMainMenuCntl;
    
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
