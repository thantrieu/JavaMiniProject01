package classes;

import student.Student;
import cat.Cat;
import cat.food.Food;
import smartphone.Apple;

/**
 *
 * @author ADMIN
 */
public class ClassesObjects {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Apple iphone15 = new Apple();
        
        Food favFood = new Food();
        
        Cat tom = new Cat("Tom", "Red");
        
        System.out.println("cat's name: " + tom.getName());
        System.out.println("cat's age: " + tom.getAge());
        System.out.println("cat's color: " + tom.getColor());
        tom.move();
        System.out.println("==================================");
        Student mai = new Student("B22DCCN123", "Nguyen Thi Mai", 20);
        Student hoang = new Student("B23DCCN123");
        hoang.setName("Nguyen Minh Hoang");
        System.out.println("Hoang's name: " + hoang.getName());
        System.out.println("------------------------------------");
        System.out.println("Name: " + mai.getName());
        System.out.println("Age: " + mai.getAge());
        System.out.println("ID: " + mai.getId());
        System.out.println("Email: " + mai.getEmail());
    }
    
}
