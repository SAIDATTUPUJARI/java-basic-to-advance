import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the value of n: ");
        int n = sc.nextInt();
        System.out.println("enter the value of x");
        int x = sc.nextInt();
        long a = 1;
        for (int i=1; i<=n; i++){
              a = a*x;

        }
        
        System.out.println(a);
        
    }
}