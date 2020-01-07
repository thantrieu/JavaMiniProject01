package loopcontrol;

/**
 *
 * @author ADMIN
 */
public class ForLoop {
    public static void main(String[] args) {
        float sum = 0;
        int n = 100;
        
        for(int i = 1; i <= n; i++) {
            sum += (float)1/i;
        }
        
        System.out.println("tong tu 1 den n: " + sum);
    }
}
