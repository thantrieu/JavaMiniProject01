package learncomparable;

import java.util.Comparator;

/**
 *
 * @author ADMIN
 */
public class CompareByAge implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o2.getAge() - o1.getAge();
    }
    
}
