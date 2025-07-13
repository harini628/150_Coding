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
        int n = sc.nextInt();int res = 0;
        while(n !=0){
            int rem = n%10;
            res = res*10+rem;
            n = n/10;
        }
        System.out.println(res);
    }
    
}
