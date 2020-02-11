package learncomparable;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author ADMIN
 */
public class LearnComparable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        
        students.add(new Student("B20DCCN111", "Nguyen Thuy Anh", "Hanoi", 20, 9.85f));
        students.add(new Student("B20DCCN112", "Tran Van Nhan", "Danang", 22, 9.85f));
        students.add(new Student("B20DCCN113", "Nguyen Trong Thien", "Hungyen", 20, 9.85f));
        students.add(new Student("B20DCCN222", "To Van Huy", "Haiduong", 21, 9.85f));
        students.add(new Student("B20DCCN333", "Le Thi Hang", "Thainguyen", 24, 9.85f));
        students.add(new Student("B20DCCN441", "Ngo Ba Nam", "Hochiminh", 21, 9.85f));
        students.add(new Student("B20DCCN568", "Hoang Thanh Uyen", "Cantho", 22, 9.85f));
        
//        Collections.sort(students, new CompareById());
        Collections.sort(students, new CompareByAge());
        showInfo(students);
    }
    
    public static void showInfo(ArrayList<Student> list) {
        for (Student student : list) {
            System.out.println(student);
        }
    }
    
}
