import java.util.Scanner;

public class odd {
    public static void printodd(int n){
        for (int i=1; i<=n; i++){
            if (i % 2 !=0){
                System.out.println(i);
            }
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("odd numbers are:");
        printodd(n);
       
    }
}
