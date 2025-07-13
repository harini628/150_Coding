package javaapplication1;
import java.util.Scanner;

/**
 *
 * @author exam
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int res = 0;
        while(n>9){
            int rem1 = n%10;
            int rem10 = (n/10)%10;
            int diff = Math.abs(rem1-rem10);
            res = res*10 + diff;
            n = n/10;
            if(n<10 && res>99){
                StringBuffer str = new StringBuffer(res+"").reverse();
                String s = str.toString();
                n = Integer.parseInt(s);
                res = 0;
                
            }
        }
        int x = (res%10)*10 + (res/10);
        System.out.println(x);
        
    }
    
}
