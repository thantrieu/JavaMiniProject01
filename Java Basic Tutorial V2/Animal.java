package animal;

import java.util.Objects;

/**
 *
 * @author ADMIN
 */
public class Animal {

    protected String name;
    protected int age;
    private float weight;

    protected void saySomething() {
        System.out.println("Bla bla bla...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void eat() {

    }

    public void move() {
        System.out.println("Animal is moving...");
    }

    public void sleep() {

    }

    @Override
    public boolean equals(Object otherObj) {
        if (this == otherObj) {
            return true;
        }

        if (otherObj == null) {
            return false;
        }

        if (!(this.getClass() == otherObj.getClass())) {
            return false;
        }

        Animal other = (Animal) otherObj;
        return Objects.equals(this.name, other.name) && this.age == other.age
                && this.weight == other.weight;
    }

    @Override
    public String toString() {
        return getClass().getName() + "[name=" + name + ", age="
                + age + ", weight=" + weight + "]";
    }

}
