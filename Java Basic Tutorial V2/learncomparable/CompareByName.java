package learncomparable;

import java.util.Comparator;

/**
 *
 * @author ADMIN
 */
public class CompareByName implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
    
}
