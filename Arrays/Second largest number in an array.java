package patterns;

import java.util.Scanner;

public class Patterns {

   
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the size of the array: ");
     int n = sc.nextInt();
        System.out.println("Enter the Array elements: ");
        int arr[] = new int[n];
        for(int q=0;q<n;q++){
            arr[q]=sc.nextInt();
        }
        int max = arr[0];int res = arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]<max && arr[i]>res){
                res = arr[i];
            }
        }
        System.out.println("The Second largest value is: "+res);
        
    }
    
}
