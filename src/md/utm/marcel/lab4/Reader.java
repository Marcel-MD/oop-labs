package md.utm.marcel.lab4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reader {
    public static List<String> read(String fileName) {
        List<String> lines = new ArrayList<>();
        try {
            File myObj = new File(System.getProperty("user.dir") + "/src/md/utm/marcel/lab4/" + fileName);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                lines.add(data);
            }
            myReader.close();
            return lines;
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            return null;
        }
    }
}
