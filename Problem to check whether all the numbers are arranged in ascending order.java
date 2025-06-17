package javaapplication40;
import java.util.Scanner;

/**
 *
 * @author hari6
 */
public class JavaApplication40 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();boolean flag = true;
        while(n > 9){
            int rem1 = n%10;
            int rem10 = (n/10)%10;
            if(rem1<rem10){
                flag = false;
                break;
            }
            n= n/10;
        }
        if(flag){
            System.out.println("The given number is in assending order");
        }else{
            System.out.println("The given number is not in assending order");
        }
    }
    
}
