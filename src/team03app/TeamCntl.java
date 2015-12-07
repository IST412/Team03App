
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
        System.out.println("s team ui");
    }
    
    public void hideTeamUI() {
        theTeamUI.setVisible(false);
        System.out.println("hide team ui");
    }
    
    public void showMain(){
        theMainMenuCntl.showMain();
        System.out.println("show main");
    }  
}
