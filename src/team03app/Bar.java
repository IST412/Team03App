/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package team03app;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Cody
 */
public class Bar 
{
    //String filePath = "/Users/tylerstraffon/documents/NetBeansProjects/Team03App/listOfBars.txt";
    String filePath = "listOfBars.txt";
    ArrayList<String> allBarInfo = new ArrayList<String>();
    ArrayList<String> listOfBars = new ArrayList<String>();
    ArrayList<String> listOfHours = new ArrayList<String>();
    ArrayList<String> listOfDays = new ArrayList<String>();
    
    public Bar()
    {
        try
        {
            File file = new File(filePath);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            StringBuffer stringBuffer = new StringBuffer();
            String line;
            while ((line = bufferedReader.readLine()) != null) 
            {
                allBarInfo.add(line);
            }
            
            fileReader.close();
        }
        
        catch(FileNotFoundException e)
        {
            
        }
        
        catch(IOException io)
        {
            
        }
    }
    
    public ArrayList<String> getBarNames()
    {
        for(int i = 0; i < allBarInfo.size(); i+=3)
        {
            listOfBars.add(allBarInfo.get(i));
        }
        
        return listOfBars;
    }
    
    public ArrayList<String> getBarDays()
    {
        for(int i = 1; i < allBarInfo.size(); i+=3)
        {
            listOfDays.add(allBarInfo.get(i));
        }
        
        return listOfDays;
    }
    
    public ArrayList<String> getBarHours()
    {
        for(int i = 2; i < allBarInfo.size(); i+=3)
        {
            listOfHours.add(allBarInfo.get(i));
        }
        
        return listOfHours;
    }


}
