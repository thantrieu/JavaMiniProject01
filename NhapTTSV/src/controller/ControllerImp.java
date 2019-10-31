package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Student;

/**
 *
 * @author ADMIN
 */
public class ControllerImp implements DAO {

    @Override
    public List<Student> readDataFromFile(String fileName) {
        List<Student> students = new ArrayList<>();
        File file = new File(fileName);
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String id = scanner.nextLine();
                String name = scanner.nextLine();
                int age = Integer.parseInt(scanner.nextLine());
                float mark = Float.parseFloat(scanner.nextLine());
                Student s = new Student(id, name, age, mark);
                students.add(s);
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        return students;
    }

    @Override
    public boolean writeDataToFile(List<Student> students, String fileName) {

        return false;
    }

}
