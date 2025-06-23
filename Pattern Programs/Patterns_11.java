import java.util.Scanner;
class Main {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        char x = (char)('A'+(n-1));
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                for(int k=1;k<=j;k++){
                    System.out.print("{");
                }
                for(int k=1;k<=j;k++){
                    System.out.print("}");
                }
                System.out.print(" ");
            }
            
            System.out.println();
           
        }
    
    }
}
