
package team03app;

public final class TimeCntl {
    public final MainMenuCntl theMainMenuCntl;
    TimeUI theTimeUI = new TimeUI(this);

    public TimeCntl(MainMenuCntl theMainMenuCntl){
        this.theMainMenuCntl = theMainMenuCntl;
        this.showTimeUI();
        theMainMenuCntl.hideMain();
    }
    
    public void showTimeUI(){
        theTimeUI.setVisible(true);
    }
    public void hideTimeUI(){
        theTimeUI.setVisible(false);
    }
    
    public void showMain() {
        theMainMenuCntl.showMain();
    }
    
}
