package learnconditioncontrol;

/**
 *
 * @author ADMIN
 */
public class TOperator {
    public static void main(String[] args) {
        int a = 108;
        String str1 = "a la so chan";
        String str2 = "a la so le";
        String str = "";
        
//        if(a % 2 == 0) {
//            str = str1;
//        } else {
//            str = str2;
//        }

        str = (a % 2 == 0) ? str1 : str2;
        
        System.out.println("thong diep: " + str);
    }
}
