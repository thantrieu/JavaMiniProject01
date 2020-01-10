package arrays;

/**
 *
 * @author ADMIN
 */
public class OneDimensionArray {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        String[] friends = {"Nam", "Hung", "La", "Hien"};
        float[] marks = {6.5f, 8.5f, 7.25f, 9.75f};

//        System.out.println("do dai mang numbers: " + numbers.length);
//        System.out.println(friends[1]);
//        friends[1] = "Hoang";
//        System.out.println(friends[1]);

//        for (int i = 0; i < friends.length; i++) {
//            System.out.println("friends[" + i + "] = " + friends[i]);
//        }
        
        int[] array = new int[100];
        
//        System.out.println(array[0]);
//        System.out.println(array[10]);
        
        String[] str = new String[20];
//        System.out.println(str[2]);
        
        boolean[] bools = new boolean[200];
        bools[1] = true;
        bools[30] = false;
        
        System.out.println(bools[5]);
    }
}
