package learncomparable;

import java.util.Comparator;

/**
 *
 * @author ADMIN
 */
public class CompareById implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getId().compareTo(o2.getId());
    }
    
}
