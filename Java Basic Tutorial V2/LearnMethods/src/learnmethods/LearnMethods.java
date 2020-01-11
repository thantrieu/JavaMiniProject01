package learnmethods;

/**
 *
 * @author ADMIN
 */
public class LearnMethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 56, b = 120;

        int tong = add(200, 60);
        System.out.println("tong = " + tong);
        
        int[] numbers = {120, 200, 323, 14, 5};
        
        float avg = average(numbers);
        System.out.println("gia tri trung binh: " + avg);
        
        findMax(1020, b, a);
    }
    
    public static void findMax(int a, int b, int c) {
        int max = a;
        if(max < b) {
            max = b;
        }
        if(max < c) {
            max = c;
        }
        System.out.println("MAX = " + max);
    }

    public static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static float average(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }

        return (float) sum / arr.length;
    }
    
    public static void doSomethig() {
        // bla bla...
    }

}
