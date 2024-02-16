import java.util.Scanner;

public class avarage {
    public static void avg(int a, int b, int c){
        int avgg = (a+b+c) / 3;
        System.out.println(avgg);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        avg(a, b, c);
    }
}
