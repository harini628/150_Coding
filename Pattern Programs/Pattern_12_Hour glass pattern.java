import java.util.Scanner;
class Main {
    public static void main(String[] args) {

    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=n-(i-1);k++){
                System.out.print("* ");
            }
            System.out.println();
           
        }
        for(int a=1;a<n;a++){
            for(int b=1;b<=(n-a-1);b++){
                System.out.print(" ");
            }
            for(int c=1;c<=a+1;c++){
                System.out.print("* ");
            }
            System.out.println();
        }
    
    }
} 
