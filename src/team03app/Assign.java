package team03app;
import java.io.*;
import java.util.*;

public final class Assign {
    
     private final File file = new File("Assign Fourm.txt");
    public final ArrayList<String> assignments = new ArrayList<>();

    public Assign() {
        try {
            readInfo(file);
        } catch (Exception ex) {
            System.out.println("No file.");
        }
    }

    public void readInfo(File file) throws FileNotFoundException, IOException {
        Scanner in = new Scanner(new FileReader(file));
        while(in.hasNext()) {
            assignments.add(in.nextLine());
        }
    }
}

