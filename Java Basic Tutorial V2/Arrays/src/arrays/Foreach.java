package arrays;

import jdk.nashorn.internal.objects.NativeArray;

/**
 *
 * @author ADMIN
 */
public class Foreach {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        String[] friends = {"Nam", "Hung", "La", "Hien"};
        float[] marks = {6.5f, 8.5f, 7.25f, 9.75f};
        
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        System.out.println("========================");
        for(float mark : marks) {
            mark = 2*mark;
            System.out.println(mark);
        }
        
        System.out.println("========================");
        for (String friend : friends) {
            System.out.println(friend);
        }
        
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        
        System.out.println("Sum = " + sum);
        
        
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        System.out.println("===============");
        for (int[] m : matrix) {
            for (int i : m) {
                System.out.print(i + " ");
            }
            System.out.println("");
        }
    }
}
