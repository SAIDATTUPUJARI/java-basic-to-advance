import java.util.Scanner;

public class gcf {
    public static int gretest(int a, int b){
        int g= 1;
        for (int i=1; i<=a && i<=b; i++){
            if (a%i==0 && b%i==0){
                g = i; 
            }
        }
        System.out.println(g);
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        gretest(a, b);
    }
}
