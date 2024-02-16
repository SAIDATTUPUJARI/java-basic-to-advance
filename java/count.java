import java.util.Scanner;

public class count {
    public static void countnumbers(int i){
        int p=0;
        int n=0;
        int z=0;
        while (i != 0) {
            if (i < 0){
                n++;
            }
            else if (i>0){
                p++;
            }
            else{
                z++;
            }
        }
        System.out.println("positives:" + p);
        System.out.println("negatives:" + n);
        System.out.println("zeros:" + z);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i= sc.nextInt();
        countnumbers(i);
    }
}
