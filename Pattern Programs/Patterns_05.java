import java.util.Scanner;
class Main {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        for(int i=n;i>0;i--){
            int p = 1;
            for(int j=1;j<=i;j++){
                System.out.print(p+" ");
                p++;
            }
            System.out.println();
        }
    
    }
}
