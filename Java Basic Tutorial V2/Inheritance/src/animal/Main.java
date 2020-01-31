package animal;

/**
 *
 * @author ADMIN
 */
public class Main {
    public static void main(String[] args) {
        Animal fish = new Fish();
        Animal direcor = new Director();
        Person student = new Student();
        Fish f = new Fish();
        fish = f;
        fish = student;
        Student s = (Student) new Person();
    }
}
