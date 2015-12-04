package team03app;

public class AssignCntl {
        public final MainMenuCntl theMainMenuCntl;

    public AssignCntl(MainMenuCntl theMainMenuCntl){
        this.theMainMenuCntl = theMainMenuCntl;
        this.showAssignUI();
        theMainMenuCntl.hideMain();
    }
    
    public void showAssignUI(){
        AssignUI theAssignUI = new AssignUI( this);
        theAssignUI.setVisible(true);
    }
    public void hideAssignUI() {
        AssignUI theAssignUI = new AssignUI(this);
        theAssignUI.setVisible(false);
    }
    
    public void showMain(){
        theMainMenuCntl.showMain();
    } 
}
