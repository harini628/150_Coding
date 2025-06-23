import java.util.Scanner;
class Main {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        char x = (char)('A'+(n-1));
        for(int i=1;i<=n;i++){
            for(int j=1;j<i;j++){
                System.out.print("  ");
            }
            char c = x;
            for(int k=1;k<=n-(i-1);k++){
                System.out.print(c + " ");
                c--;
            }
            x--;
            
            System.out.println();
           
        }

        
    }
}
