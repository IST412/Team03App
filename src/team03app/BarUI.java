/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package team03app;

import javax.swing.JFrame;

/**
 *
 * @author Cody
 */
public class BarUI extends JFrame{
    
    Bar newBar = new Bar();
    
    public BarUI(){
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        //debug
        System.out.println(newBar.getBarNames());
        System.out.println(newBar.getBarHours());
        System.out.println(newBar.getBarDays());
    }
    
}
