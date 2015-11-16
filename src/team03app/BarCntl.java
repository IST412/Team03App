/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package team03app;

/**
 *
 * @author Cody
 */
public class BarCntl {
    
    public BarCntl(MainMenuCntl theMainMenuCntl){
        this.showBarUI();
        theMainMenuCntl.hideMain();
    }
    
    public void showBarUI(){
        BarUI theBarUI = new BarUI();
        theBarUI.setVisible(true);
    }
    
}
