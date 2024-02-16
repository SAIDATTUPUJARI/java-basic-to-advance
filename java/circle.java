import java.util.Scanner;
import java.lang.Math;
public class circle {
    public static double circumference(float r){
        double c =2 * Math.PI * r;
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float r = sc.nextFloat();
        System.out.println(circumference(r));
    }
}
