package javaapplication40;
import java.util.Scanner;


public class JavaApplication40 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int sum = 0;
        while(n>0){
            int rem = n%10;
            sum = sum+rem;
            n = n/10;
            if(n==0 && sum>9){
                n=sum;
                sum = 0;
            }
            
        }
        if(sum == 1){
            System.out.println("It is a magical number");
        }else{
            System.out.println("It is not a magical number");
        }
    }
    
}
