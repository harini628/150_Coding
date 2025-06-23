package patterns;

import java.util.Scanner;

public class Patterns {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the size of the array: ");
     int n = sc.nextInt();
        System.out.println("Enter the Array elements: ");
        int arr[] = new int[n];int sum2=0;
        for(int q=0;q<n;q++){
            arr[q]=sc.nextInt();
            sum2 = sum2 + arr[q];
        }
        int sum1 = (n+1)*(n+2)/2;
        int res = sum1 - sum2;
        System.out.println("The missing value is: "+res);
        
    }
    
}
