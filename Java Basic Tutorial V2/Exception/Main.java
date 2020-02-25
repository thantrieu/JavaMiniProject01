
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Windows 10
 */
public class Main {
    public static void main(String[] args) {
        try {
            readDataFromFile();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void readDataFromFile() throws FileNotFoundException {
        File file = new File("data.txt");
        Scanner scanner = new Scanner(file);
        
    }
    
}
