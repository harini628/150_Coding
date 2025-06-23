import java.util.Scanner;
class Main {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int p=1;int x=1;
        for(int i=1;i<=n;i++){
            p=x;
            for(int j=1;j<i;j++){
                System.out.print("  ");
            }
            x=p;
            for(int k=1;k<=n-(i-1);k++){
                System.out.print(p+" ");
                p++;
            }
            System.out.println();
            x++;
        }
    
    }
}
