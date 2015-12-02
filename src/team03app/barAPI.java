
package team03app;

import java.io.*;
import java.util.*;

public class barAPI 
{
    String filePath = "";
    ArrayList<String> listOfBars = new ArrayList<String>();
    
    
    public ArrayList<String> getBars() throws FileNotFoundException
    { 
            Scanner s = new Scanner(new File(filePath));
        
            while (s.hasNext())
            {
                listOfBars.add(s.next());
            }
        
        s.close();
        
        return listOfBars;
    }
    
}
