import java.util.Scanner;

public class greatest {
    public static void grate(int a, int b){
        if (a > b){
            System.out.println(a);
        }
        if (b > a){
            System.out.println(b);
        }
        else {
            System.out.println("both are equal");
        }
    return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b =sc.nextInt();
        grate(a, b);
    }
}
