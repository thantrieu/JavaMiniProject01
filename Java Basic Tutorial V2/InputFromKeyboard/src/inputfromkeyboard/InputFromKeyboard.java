package inputfromkeyboard;

import java.util.Scanner;

/**
 * 
 * @author ADMIN
 */
public class InputFromKeyboard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a, x;
        float f;
        double d;
        boolean b;
        String firstName;
        String fullName;

        Scanner scanner = new Scanner(System.in);
        scanner.nextFloat();
        /*
        System.out.println("Nhap vao 2 gia tri kieu int: ");
        a = scanner.nextInt();
        x = scanner.nextInt();
        System.out.println("a = " + a);
        */
        /* đây
        la comment
        trên nhiều
        dòng
        ...
        
        */
//        f = scanner.nextFloat();
//        System.out.println("f = " + f);
        
//          System.out.println("Nhap vao gia tri double: ");
//          d = scanner.nextDouble();
//          System.out.println("gia tri vua nhap: " + d);
//        System.out.println("Nhap vao gia tri true or false");
//        b = scanner.nextBoolean();
//        
//        System.out.println("ban vua nhap: " + b);
//        System.out.println("Nhap vao ten cua ban: ");
//        firstName = scanner.next();
//        System.out.println("Xin chao " + firstName);


        System.out.println("Nhap ho ten day du: ");
        fullName = scanner.nextLine();
        System.out.println("Xin chao " + fullName);
    }
    
    /** this is method use for add two number...
     * @param a
     * @param b
     * @return 
     */
    public static int add(int a, int b) {
        return a + b;
    }

}
