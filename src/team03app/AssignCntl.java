/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package team03app;

/**
 *
 * @author Cody
 */
public class AssignCntl {
    
    public AssignCntl(MainMenuCntl theMainMenuCntl){
        this.showAssignUI();
        theMainMenuCntl.hideMain();
    }
    
    public void showAssignUI(){
        AssignUI theAssignUI = new AssignUI();
        theAssignUI.setVisible(true);
    }
    
}
