import java.util.Scanner;
class Main {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1||i==n){
                    System.out.print("1 ");
                }else if(j==n && (i>1 && i<n)){
                    System.out.print(n+" ");
                }else if(j==1 && (i>1 && i<n)){
                    System.out.print(i+" ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    
    }
}
