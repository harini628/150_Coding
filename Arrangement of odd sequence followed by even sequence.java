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
        String odd = "";
        String even = "";
        String s = n+"";
        for(int i=0;i<s.length();i++){
            char x = s.charAt(i);
            int a = x - '0';
            if(a%2 == 0){
                even = even + x;
            }else{
                odd = odd + x;
            }
        }
        String res = odd + even;
        int result = Integer.parseInt(res);
        System.out.println(result);
        
    }
    
}
