/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package team03app;

/**
 *
 * @author Cody
 */
public class MainMenuCntl {
    
    public MainMenuCntl(){
        this.showSplash();
        this.showMain();
    }
    
    public void showSplash(){
        SplashScreen theSplashScreen = new SplashScreen();
        theSplashScreen.setVisible(true);
        
        try{
        Thread.sleep(3000);
        }
        
        catch(Exception e){
            e.printStackTrace();
        }     
        
        theSplashScreen.setVisible(false);
    }
    
    public void showMain(){
        MainMenuUI theMainMenuUI = new MainMenuUI();
        theMainMenuUI.setVisible(true);
    }
}
