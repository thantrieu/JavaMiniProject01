package readdatafromfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


/**
 *
 * @author ADMIN
 */
public class ReadDataFromFile {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("input.txt");
        Scanner scanner = new Scanner(file);
        String[] words = new String[100];
        
        int[] numbers = new int[100];
        
        int i = 0;
        if(scanner.hasNextLine()) {
            scanner.nextLine();
        }
        
        while(scanner.hasNextInt()) {
            int num = scanner.nextInt();
            numbers[i] = num;
            i++;
            if(i >= 100) {
                break;
            }
        }
        
        showNumber(numbers, i);
    }

    private static void showInfo(String[] words) {
        for (String word : words) {
            if(word == null) {
                break;
            }
            System.out.println(word);
        }
    }

    private static void showNumber(int[] numbers, int size) {
        for (int i = 0; i < size; i++) {
            System.out.println(numbers[i]);
        }
    }
    
}
