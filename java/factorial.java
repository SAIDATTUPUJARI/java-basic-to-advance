import java.util.Scanner;

public class factorial {
    public static void fact(int n){
        int fac = 1;
        for (int i=n; i>=1; i--){
            fac = fac * i;
        }
        System.out.println(fac);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fact(n);
    }
}
