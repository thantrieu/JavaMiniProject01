package controller;

import java.util.List;
import model.Student;

/**
 *
 * @author ADMIN
 */
public interface DAO {
    List<Student> readDataFromFile(String fileName);
    boolean writeDataToFile(List<Student> students, String fileName);
}
