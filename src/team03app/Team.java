
package team03app;

import java.io.*;
import java.util.*;

public class Team {

    File file = new File("TeamInfo.txt");
    ArrayList<String> info = new ArrayList<>();

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
            info.add(in.nextLine());
        }
        
    }
}
