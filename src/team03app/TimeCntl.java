
package team03app;

public final class TimeCntl {
    public final MainMenuCntl theMainMenuCntl;

    public TimeCntl(MainMenuCntl theMainMenuCntl){
        this.theMainMenuCntl = theMainMenuCntl;
        this.showTimeUI();
        theMainMenuCntl.hideMain();
    }
    
    public void showTimeUI(){
        TimeUI theTimeUI = new TimeUI(this);
        theTimeUI.setVisible(true);
    }
    public void hideTimeUI(){
        TimeUI theTimeUI = new TimeUI(this);
        theTimeUI.setVisible(false);
    }
    
    public void showMain() {
        theMainMenuCntl.showMain();
    }
    
}
