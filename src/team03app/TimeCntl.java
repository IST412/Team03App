/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package team03app;

/**
 *
 * @author Cody
 */
public final class TimeCntl {
    
    public TimeCntl(MainMenuCntl theMainMenuCntl){
        this.showTimeUI();
        theMainMenuCntl.hideMain();
    }
    
    public void showTimeUI(){
        TimeUI theTimeUI = new TimeUI();
        theTimeUI.setVisible(true);
    }
    
}
