import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class JavaException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            double res = div(a, b);
            System.out.println(a + "/" + b + " = " + res);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("abc");

        String str = null;
        showLength(str);
        int[] arr = new int[]{1, 2, 3, 4, 5};
        
        System.out.println("arr[5] = " + arr[2]);
        
        int x = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Hay nhap mot so nguyen: ");
        try{
            x = sc.nextInt();
            System.out.println("x = " + x);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    static double div(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Phep chia khong the thuc hien do mau so bang 0.");
        }
        return a / b;
    }

    static void showLength(String str) {
        if (str != null) {
            System.out.println("Length of this string: " + str.length());
        } else {
            System.out.println("Tham so truyen vao la null.");
        }
    }

}