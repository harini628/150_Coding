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
        int odd_count = 0;int even_count = 0;
        for(int i=0;i<s.length();i++){
            char x = s.charAt(i);
            int a = x - '0';
            if(a%2 == 0){
                even = even + x;
                even_count++;
                
            }else{
                odd = odd + x;
                odd_count++;
            }
        }
        String res = odd + odd_count+ even + even_count;
        int result = Integer.parseInt(res);
        System.out.println(result);
        
    }
    
}
