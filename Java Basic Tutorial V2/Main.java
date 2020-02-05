package animal;

import java.util.Objects;

/**
 *
 * @author ADMIN
 */
public class Main {

    public static void main(String[] args) {
//        Animal tom = new Animal();
//        tom.setName("Tom");
//        tom.setAge(3);
//        tom.setWeight(5);
//        
//        Animal jerry = new Animal();
//        jerry.setName("Tom");
//        jerry.setAge(3);
//        jerry.setWeight(5);
//        
//        System.out.println(tom);
        
//        Object o = null;
//        Objects.equals(o, null);

        Animal s = new Student();
        Animal tom = new Cat();
        Object obj = new Student();
        
        if(tom instanceof Student) {
            Student student = (Student)tom;
        }
        
    }
}
