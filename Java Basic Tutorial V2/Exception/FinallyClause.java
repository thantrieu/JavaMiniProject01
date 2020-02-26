/*
 * finally clause
 */
package exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class FinallyClause {

    public static void main(String[] args) throws FileNotFoundException {
        File file = null;
        Scanner scanner = null;
        try {
            System.out.println("dong dau tien trong try");
            file = new File("abc.txt");
            scanner = new Scanner(file);
            System.out.println("dong phia duoi noi xay ra ngoai le trong try");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            throw e;
//            System.out.println("trong khoi catch");
        } catch(NullPointerException e) {
            System.out.println("Null!");
        } finally {
            if(scanner != null) {
                scanner.close();
            }
            System.out.println("thuc hien khoi finally");
        }
        System.out.println("code sau khoi finally");
        
        // 1. khong xay ra ngoai le
        // 2. dc xu ly boi khoi catch tuong ung
        // 3. xay ra ngoai le nhung khong duoc xu ly
    }
}
