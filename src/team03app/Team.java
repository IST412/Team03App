/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package team03app;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author Cody
 */
public class Team {

    File file = new File("TeamInfo.txt");

    public Team() {
        try {
            readInfo(file);
        } catch (Exception ex) {
            System.out.println("No file.");
        }

    }

    public void readInfo(File file) throws FileNotFoundException, IOException {
        Scanner in = new Scanner(new FileReader(file));
        while(in.hasNext()) {
            System.out.println(in.nextLine());
        }
        
    }
}
