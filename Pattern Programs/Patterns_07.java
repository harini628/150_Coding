import java.util.Scanner;
class Main {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int x = 1;
        for(int i=n;i>=1;i--){
            int p=x;
            for(int j=1;j<=i;j++){
                System.out.print(p+" ");
                p++;
            }
            System.out.println();
            x++;
        }
    
    }
}
