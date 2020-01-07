package loopcontrol;

/**
 *
 * @author ADMIN
 */
public class WhileLoop {

    public static void main(String[] args) {
//        int n = 600;
//        float sum = 0;
//        int i = 1;
//        while (i <= n) {
//            sum += (float)1 / i;
//            i++;
//        }
//
//        System.out.println("sum = " + sum);

        String msg = "Hello World!";
        int i = msg.length() - 1;
        while(i >= 0) {
            System.out.println(msg.charAt(i));
            i--;
        }
    }
}
