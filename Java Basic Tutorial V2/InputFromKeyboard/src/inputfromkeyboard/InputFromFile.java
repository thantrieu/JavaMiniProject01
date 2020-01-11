package inputfromkeyboard;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class InputFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("input.txt"));
        String message =sc.nextLine();
        System.out.println(message);
    }
}
