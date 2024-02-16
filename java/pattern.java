import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();

        for(int j=0; j<=N; j++){
            
            for(int i=0; i<=N-j-1; i++){
                System.out.print(" ");
            }
            for(int i=0; i<2*j+1; i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}