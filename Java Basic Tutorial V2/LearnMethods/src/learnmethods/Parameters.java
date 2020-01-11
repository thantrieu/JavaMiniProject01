package learnmethods;

/**
 *
 * @author ADMIN
 */
public class Parameters {
    public static void main(String[] args) {
        // parameter
        // argument
        int a = 20;
        add(a, 20);
        
        String[] arr = {"Trang", "Nam", "Nhung"};
        
        showInfo(arr, a);
        
        float x = 25.3f;
        float y = 3.14156f;
        
        float[] arrf = {25.25f, 65, 27, 34.6f};
        float[] arrf2 = {25.25f, 65, 27, 34.6f};
        
        addMultil(arrf);
    }
    
    public static int add(int a, int b) {
        return a + b;
    }
    
    public static void showInfo(String[] str, int number) {
        
    }
    
    public static void addMultil(float ...args) {
        float sum = 0;
        for (float arg : args) {
            sum += arg;
        }
        
        System.out.println("SUM = " + sum);
    }
}
