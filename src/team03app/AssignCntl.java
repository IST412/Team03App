package team03app;

public class AssignCntl {
        public final MainMenuCntl theMainMenuCntl;
        AssignUI theAssignUI = new AssignUI(this);

    public AssignCntl(MainMenuCntl theMainMenuCntl){
        this.theMainMenuCntl = theMainMenuCntl;
        this.showAssignUI();
        theMainMenuCntl.hideMain();
    }
    
    public void showAssignUI(){ 
        theAssignUI.setVisible(true);
    }
    public void hideAssignUI() {
        theAssignUI.setVisible(false);
    }
    
    public void showMain(){
        theMainMenuCntl.showMain();
    } 
}
