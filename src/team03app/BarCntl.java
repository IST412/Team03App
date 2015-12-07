/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package team03app;

import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author Cody
 */
public final class BarCntl {
    
    public final MainMenuCntl theMainMenuCntl;
    
    ArrayList<String> listOfBars = new ArrayList<String>();
    int numberOfBars;
    String randomBarName;
    
    
    public BarCntl(MainMenuCntl theMainMenuCntl){
        this.theMainMenuCntl = theMainMenuCntl;
        this.showBarUI();
        theMainMenuCntl.hideMain();
    }
    
    public void showBarUI(){
        BarUI theBarUI = new BarUI(this);
        theBarUI.setVisible(true);
    }
    
    
    public String randomBar(){
        Bar newBar = new Bar();
        Random randomGenerator = new Random();     
        listOfBars = newBar.getBarNames();
        numberOfBars = listOfBars.size();
        int randomInt = randomGenerator.nextInt(numberOfBars);
        randomBarName = listOfBars.get(randomInt);
        return randomBarName;
    }
    
    
    public void hideBarUI(){
        BarUI theBarUI = new BarUI(this);
        theBarUI.setVisible(false);
    }
}
