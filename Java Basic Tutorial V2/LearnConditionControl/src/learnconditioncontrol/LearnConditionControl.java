package learnconditioncontrol;

/**
 *
 * @author ADMIN
 */
public class LearnConditionControl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // 1 - t2, 2 - t3
        
        if(2 % 5 == 0) {
            System.out.println("");
        } else {
            
        }
        
        int day = 2;
        if(day == 1){
            System.out.println("Thu Hai");
        } else if(day == 2) {
            System.out.println("Thu Ba");
        } else if(day == 3) {
            System.out.println("Thu Tu");
        } else if(day == 4) {
            System.out.println("Thu Nam");
        } else if(day == 5) {
            System.out.println("Thu Sau");
        } else if(day == 6) {
            System.out.println("Thu Bay");
        } else if(day == 7) {
            System.out.println("Chu Nhat");
        } else {
            System.out.println("Ngay nay khong hop le!");
        }
    }
    
}
